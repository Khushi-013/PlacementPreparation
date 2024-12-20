#User function Template for python3

class AutoCompleteSystem:
    def __init__(self, sentences, times):
        # Initialize the data structures
        self.history = {}
        for sentence, time in zip(sentences, times):
            self.history[sentence] = self.history.get(sentence, 0) + time
        self.current_query = ""
    
    def input(self, c):
        if c == '#':
            # End of query, save it in the history and reset current query
            if self.current_query:
                self.history[self.current_query] = self.history.get(self.current_query, 0) + 1
            self.current_query = ""
            return []
        else:
            # Add the character to the current query
            self.current_query += c
            # Find the top 3 suggestions
            suggestions = []
            for sentence in self.history:
                if sentence.startswith(self.current_query):
                    suggestions.append((self.history[sentence], sentence))
            # Sort by frequency, then by ASCII order
            suggestions.sort(key=lambda x: (-x[0], x[1]))
            # Return top 3 suggestions
            return [sentence for _, sentence in suggestions[:3]]