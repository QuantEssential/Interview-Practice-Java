// you can also use imports, for example:
// import java.math.*;
class Solution {
    
	public static int solution(int A, int B) {
        // write your code in Java SE 7
        
        int nonprimes = 0;
        int totalnums = B-A+1;
        for(int i=A; i<=B; i++) {   /* test each integer to see if it is prime
                            if divisor is found, increment nonprimes
                            nonprime numbers are easier to identify
                        */

            for(int j=3; j<=i/2; j++)    {
                if( i%j == 0 )   {
                    nonprimes++;
                    break;
                }
            }
        }
        
        return totalnums-nonprimes;
    }
    
    
    static public void main(String args[])  {
        
        int result = -1;
        
        result = Solution.solution(11,19);
        
        System.out.println(Integer.toString(result));
    }
    
}
