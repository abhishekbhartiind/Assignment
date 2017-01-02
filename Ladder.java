/* Solution : 
A java program to count number of ways to reach n'th stair when
A person can climb 1 or 2 stairs at a time
*/
import java.util.Scanner;
class Ladder
{
    // A recursive function used by countWays
    static int result(int A, int B)
    {
        if (A <= 1)
            return A;
        int res = 0;
        for (int i = 1; i<=B && i<=A; i++)
            res += result(A-i, B);
		
        return res;
    }
    // Returns number of ways to reach s'th stair
    static int countWays(int n, int B)
    {
        return result(n+1, B);
    }
     public static void main (String args[])
    {  Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of Stairs in the ladder : ");
		int n = sc.nextInt();
        int B = 2; int A = 1;
        System.out.println("Number of ways = "+ countWays(n,B));
    } 
}
