class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] ne = new int[n];
        for(int i =0; i <n; i++){
            ne[i] = arr[i];
        }
        Arrays.sort(ne);
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 1;
        for(int i =0; i < ne.length; i++){
            if(!map.containsKey(ne[i])){
                map.put(ne[i],k++);
            } else{
                map.put(ne[i],map.get(ne[i]));
            }
        }
        for(int i =0;i<arr.length; i++){
            ne[i] = map.get(arr[i]);
        }
        return ne;
    }
}