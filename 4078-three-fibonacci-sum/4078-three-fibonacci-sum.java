class Solution {
    public boolean threeFibonacciSum(int n) {

        int first = 0;
        int second = 1;
        int third = first + second;

        int sum = 0;
        
        while (third < n){
            sum = first + second + third;
            if(sum  == n){
                return true;
            }
            first = second;
            second = third;
            third = first + second;
        }
    return false;
    }
}