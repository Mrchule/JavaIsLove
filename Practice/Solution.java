package Java.Practice;

class Solution {
    public boolean isPalindrome(int x) {
        int rem;
        int y=0;
        while(x!=0){
            rem=x%10;
            y=y*10+rem;
           x= x/10;

        }
        if(x==y){
            return true;
        }
        else{
            return false;
        }

        
    }
    
}