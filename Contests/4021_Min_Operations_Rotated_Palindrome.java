class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int ans=Integer.MAX_VALUE;
        for(int k=0;k<n;k++){
            int operations=k;
            for(int i=0;i<n/2;i++){
                char left=s.charAt((i+k)%n);
                char right=s.charAt((n-1-i+k)%n);
                int diff=Math.abs(left-right);
                int cost=Math.min(diff,26-diff);
                operations=operations+cost;
            }
            ans=Math.min(ans,operations);
        }
        return ans;
    }
}
