/* Solution : 
A java program to count number of ways to reach n'th stair when
A person can climb 1 or 2 stairs at a time
*/

class stairs
{
    // A simple recursive program to find n'th fibonacci number
    static int fib(int n)
    {
       if (n <= 1)
          return n;
       return fib(n-1) + fib(n-2);
    }
     
    // Returns number of ways to reach s'th stair
    static int countWays(int s)
    {
        return fib(s + 1);
    }
 
 
    /* Driver program to test above function */
    public static void main (String args[])
    {
          int s = 4;
          System.out.println("Number of ways = "+ countWays(s));
    }
}
