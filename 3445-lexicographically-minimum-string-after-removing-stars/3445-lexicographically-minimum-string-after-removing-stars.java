import java.util.*;

class Solution {
    public String clearStars(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, new ArrayList<>());
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                for (char c = 'a'; c <= 'z'; c++) {
                    ArrayList<Integer> positions = map.get(c);
                    if (!positions.isEmpty()) {
                        int index = positions.remove(positions.size() - 1);
                        sb.setCharAt(index, '#');
                        break;
                    }
                }
            } else {
                sb.append(ch);
                map.get(ch).add(sb.length() - 1);
            }
        }
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
