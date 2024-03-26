class Solution {
    public int subtractProductAndSum(int n) {
        int a = 0;
        int b  = 1;
         while (n != 0){
             int temp = n%10;
              a = a + temp;
              b = b * temp;
              n = n/10;
         }
         return b - a;
    }
}