// you can also use imports, for example:
// import java.math.*;
class DannyBOI {
    public int Solution(String S) {
        // write your code in Java SE 7
        int[] charmap = new int[26];
        // loop through the string to map each character to a number 0-25
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            int ascii = (int)(c) - (int)('a');
            charmap[ascii]++;
        }
        
        int numodd = 0;
        /*
            if there is an even number of each character, for every character except for
            1 character which could be placed in the middle, a palindrome could be created
            */
        for(int i=0; i<charmap.length;i++)  {
            if(charmap[i] % 2 == 1)  { // an odd number of characters
                numodd++;
            }
            if(numodd>1)    {
                return 0;
            }
        }
        
        if(numodd < 1)  {
            return 1;
        }
        return -1;
    }
    
    public DannyBOI()   {
        int result = -1;
        String test = new String("anagana");
        result = Solution(test);
        if(result == 1) {
            System.out.println("This String is an anagram of some palindrome ");  
        } else if(result == 0)  {
            System.out.println("This String is not an anagram of some palindrome ");  
        } else  {
            System.out.println("Error");
        }
    }
    
    public static void main(String args[])   {
        new DannyBOI();
    }
}
