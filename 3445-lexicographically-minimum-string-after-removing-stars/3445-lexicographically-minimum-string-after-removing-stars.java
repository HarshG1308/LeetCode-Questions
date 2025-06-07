import java.util.*;

class Solution {
    public String clearStars(String s) {
        // Store the characters added to the result
        StringBuilder sb = new StringBuilder();

        // Map from character to list of indices in sb
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, new ArrayList<>());
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                // Remove the smallest lex character stored so far
                for (char c = 'a'; c <= 'z'; c++) {
                    ArrayList<Integer> positions = map.get(c);
                    if (!positions.isEmpty()) {
                        int index = positions.remove(positions.size() - 1); // remove last occurrence
                        sb.setCharAt(index, '#'); // mark for deletion
                        break;
                    }
                }
            } else {
                sb.append(ch);
                map.get(ch).add(sb.length() - 1); // store index of this character
            }
        }

        // Build final result excluding marked characters and '*'
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c != '#' && c != '*') {
                result.append(c);
            }
        }

        return result.toString();
    }
}
