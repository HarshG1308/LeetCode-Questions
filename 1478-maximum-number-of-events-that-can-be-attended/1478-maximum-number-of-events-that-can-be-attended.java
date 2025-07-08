class Solution {
    public int maxEvents(int[][] events) {
        int i = 0;
        int cnt = 0;
        Arrays.sort(events, (a,b) -> a[0] - b[0]);
        int d = events[i][0];
        Queue<Integer> pq = new PriorityQueue<>();
        while(i < events.length || !pq.isEmpty()){
            if(pq.isEmpty()) d = events[i][0];
            while(i < events.length && events[i][0] == d){
                pq.offer(events[i][1]);
                i++;
            }
            if(!pq.isEmpty()){
                pq.poll();
                cnt++;
                d++;
            }
            while(!pq.isEmpty() && pq.peek() < d){
                pq.poll();
            }
        }
        return cnt;
    }
}