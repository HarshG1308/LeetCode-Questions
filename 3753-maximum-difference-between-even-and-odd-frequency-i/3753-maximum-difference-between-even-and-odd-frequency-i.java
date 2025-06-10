class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(char ch : map.keySet()){
            int g = map.get(ch);
            if(g % 2 == 0) even.add(g);
            else odd.add(g); 
        }
        int ema = Integer.MIN_VALUE;
        int emi = Integer.MAX_VALUE;
        int oma = Integer.MIN_VALUE;
        int omi = Integer.MAX_VALUE;
        for(int i : even){
            ema = Math.max(ema, i);
            emi = Math.min(emi, i);
        }
        for(int i : odd){
            oma = Math.max(oma, i);
            omi = Math.min(omi, i);
        }
        return oma-emi;
    }
}