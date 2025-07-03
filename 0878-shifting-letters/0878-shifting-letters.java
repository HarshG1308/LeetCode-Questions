class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        if (s.isEmpty() || shifts == null || shifts.length == 0) {
            return s;
        }
        char[] result = s.toCharArray();
        long totalShifts = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            totalShifts += shifts[i];
            int currentChar = result[i] - 'a';
            currentChar = (int) ((currentChar + totalShifts) % 26);
            result[i] = (char) (currentChar + 'a');
        }
        return new String(result);
    }
}