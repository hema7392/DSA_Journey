class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int current=0;
        int time=0;
        for(int floor:requests){
            time=time+ Math.abs(current-floor);
            current=floor;
        }
        return time;
    }
}
