// A solid cube of 10 cm x 10cm x 10 cm rests on the ground.  It has a beetle on it, and some sweet honey spots at various locations on the surface of the cube.  The beetle starts at a point on the surface of the cube, and goes to the honey spots in order along the surface of the cube.

// Problem Description
// A solid cube of 10 cm x 10cm x 10 cm rests on the ground.  It has a beetle on it, and some sweet honey spots at various locations on the surface of the cube.  The beetle starts at a point on the surface of the cube, and goes to the honey spots in order along the surface of the cube.

// 1.      If it goes from a point to another point on the same face (say X to Y), it goes in an arc of a circle that subtends an angle of 60 degrees at the centre of the circle

// 2.      If it goes from one point to another on a different face, it goes by the shortest path on the surface of the cube, except that it never travels along the bottom of the cube

// The beetle is a student of Cartesian geometry, and knows the coordinates (x, y, z) of all the points it needs to go to.  The origin of coordinates it uses is one corner of the cube on the ground, and the z axis points up.  Hence, the bottom surface (on which it does not crawl) is z=0, and the top surface is z=10.  The beetle keeps track of all the distances travelled, and rounds the distance travelled to two decimal places once it reaches the next spot, so that the final distance is a sum of the rounded distances from spot to spot.


// Input
// The first line gives an integer N, the total number of points (including the starting point) the beetle visits

// The second line is a set of 3N comma separated non-negative numbers, with up to two decimal places each.  These are to be interpreted in groups of three as the x, y, z coordinates of the points the beetle needs to visit in the given order.

// Output
// One line with a number giving the total distance travelled by the beetle accurate to two decimal places.  Even if the distance travelled is an integer, the output should have two decimal places.

// Constraints
// None of the points the beetle visits is on the bottom face (z=0) or on any of the edges of the cube (the lines where two faces meet)

// 2<=N<=10

// Difficulty Level
// Complex

// Time Limit (secs)
// 1

package TCSCODEVITA;

import java.util.*;
import java.text.DecimalFormat;

public class Cube {
    private static double euclideanDistance(double[] p1, double[] p2){
        return Math.sqrt(Math.pow(p1[0]-p2[0], 2)+Math.pow(p1[1]-p2[1], 2)+Math.pow(p1[2]-p2[2], 2));
    }
    private static boolean isSameFace(double[] p1, double[] p2){
        return (p1[0]==p2[0])||(p1[1]==p2[1])||(p1[2]==p2[2]);
    }
    private static double arcDistance(double[] p1, double[] p2){
        double straightLineDistance = euclideanDistance(p1, p2);
        return (2*Math.PI*straightLineDistance)/6;
    }
    private static double surfaceDistance(double[] p1, double[] p2){
        double minDistance = Double.MAX_VALUE;
        minDistance = Math.min(minDistance, Math.abs(p1[0]-p2[0])+Math.abs(p1[1]-p2[1])+Math.abs(p1[2]-p2[2]));
        return minDistance;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String[] input = scanner.nextLine().split(",");
        double[][] points = new double[N][3];

        for(int i=0; i<N; i++){
            points[i][0] = Double.parseDouble(input[i*3]);
            points[i][1] = Double.parseDouble(input[i*3+1]);
            points[i][2] = Double.parseDouble(input[i*3+2]);
        }

        double totalDistance = 0.0;

        for(int i=0; i<N-1; i++){
            double distance;

            if(isSameFace(points[i], points[i+1])){
                distance = arcDistance(points[i], points[i+1]);
            }else{
                distance = surfaceDistance(points[i], points[i+1]);
            }

            distance = Math.round(distance*100.0)/100.0;

            totalDistance += distance;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(totalDistance));
    }
}
