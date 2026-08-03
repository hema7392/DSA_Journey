class Solution {
    public int majorityElement(int[] nums) {
        int Count=0;
        int Candidate=0;
        for(int num:nums){
            if(Count==0){
                Candidate=num;
            }
            if(num==Candidate){
                Count++;
            }
            else{
                Count--;
            }
        }
        return Candidate;
    }
}
//Boyer-Moore Voting Algorithm
