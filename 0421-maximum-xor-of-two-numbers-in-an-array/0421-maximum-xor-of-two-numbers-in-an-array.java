class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie t=new Trie();
        for(int val:nums){
            t.add(val);
        }
        int ans = 0;
        for(int i : nums){
            ans = Math.max(ans, t.getMax(i));
        }
        return ans;
    }

    static class Trie{
        static class Node
        {
            int val;
            Node zero;
            Node one;
        }

        private static Node root;

        public Trie(){
            root = new Node();
        }

        public void add(int val){
            Node curr = root;
            for(int i = 31; i >= 0; i--){
                int bit = (val & (1 << i));
                if(bit == 0){
                    if(curr.zero != null){
                        curr = curr.zero;
                    } else{
                        Node nn = new Node();
                        nn.val = 0;
                        curr.zero = nn;
                        curr = nn;
                    }
                } else{
                    if(curr.one != null){
                        curr = curr.one;
                    } else{
                        Node nn = new Node();
                        nn.val = 0;
                        curr.one = nn;
                        curr = nn;
                    }
                }
            }
        }

        public int getMax(int val){
            Node curr=root;
            int ans=0;
             for(int i=31;i>=0;i--){
                int bit=(val &(1<<i));
                if(bit==0){
                    if(curr.one!=null){
                        ans=ans+(1<<i);
                        curr=curr.one;
                    }else{
                        curr=curr.zero;
                    }

                }else{
                    if(curr.zero!=null){
                        ans=ans+(1<<i);
                        curr=curr.zero;
                    }else{
                        curr=curr.one;
                    }

                }
             }
             return ans;
        }
    }
}