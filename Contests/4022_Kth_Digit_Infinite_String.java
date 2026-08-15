class Solution {
    public int kthDigit(long k) {
        if(k<=9){
            return (int)k;
        }
        k=k-9;
        long start=1;
        int digits=2;
        while(true){
            long group=90L*start*digits;
            if(k<=group){
                break;
            }
            k=k-group;
            start=start*10;
            digits++;
        }
        long block=(k-1)/(10L*digits);
        long pos=(k-1)%(10*digits);
        long b=start+block;
        long index=pos/digits;
        int digitIndex=(int)(pos%digits);
        long number;
        if(b%2==0){
            number=10*b+index;
        }
        else{
            number=10*b+9-index;
        }
        return String.valueOf(number).charAt(digitIndex)-'0';
    }
}