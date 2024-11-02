class Solution {
    public boolean isCircularSentence(String sentence) {
         String[] arr = sentence.split(" ");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i].charAt(arr[i].length()-1)!=arr[(i+1)%arr.length].charAt(0)) return false;
        }
        return true;
    }
}