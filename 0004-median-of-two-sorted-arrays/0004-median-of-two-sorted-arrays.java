class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] arr = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            } else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }   
        while(i < n) {arr[k++] = nums1[i++];}
        while(j < m) arr[k++] = nums2[j++];
        double ans = (n+m) % 2 == 0 ? (arr[(n+m)/2] + arr[(n+m)/2 - 1])/2.0 : arr[(n+m)/2]*1.0;
        return ans;
    }
}