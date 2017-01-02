/* 
Tower Of Hanoi
This puzzle can be solved using recursion. 
For a moment, assume that there are just two discs (disc 1 and 2; disc 2 being the larger one)
 on the first pole. The solution consists of three steps. 

Step 1: Move disc 1 from pole 1 to pole 2.
Step 2: Move disc 2 from pole 1 to pole 3.
Step 3: Move disc 1 from pole 1 to pole 3.

 Now, assume that disc 1 is not a single disc but a collection of discs.
 The procedure would be similar to the above three steps, but steps 1 and 3 would be a collection of steps. 
 Step 1 would be to move the n-1 discs(assuming that there were a total of n discs) from pole 1 to pole 2.
 For moving these (n -1) discs, we again follow the same strategy of considering them as 1 disc plus a set of n-2 discs. 
 Step 3 would also be similar.

*/

import java.util.*;
 
 /* Class TowerOfHanoi */
 public class TOH
 {
     public static int N;
     /* Creating Stack array  */
     public static Stack<Integer>[] tower = new Stack[4]; 
 
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         tower[1] = new Stack<Integer>();
         tower[2] = new Stack<Integer>();
         tower[3] = new Stack<Integer>();
         /* Accepting number of disks */         
         System.out.println("Enter number of disks");
         int num = scan.nextInt();
         N = num;
         toh(num);
     }
     /* Function to push disks into stack */
     public static void toh(int n)
     {
         for (int d = n; d > 0; d--)
             tower[1].push(d);
         display();
         move(n, 1, 2, 3);         
     }
     /* Recursive Function to move disks */
     public static void move(int n, int a, int b, int c)
     {
         if (n > 0)
         {
             move(n-1, a, c, b);     
             int d = tower[a].pop();                                             
             tower[c].push(d);
             display();                   
             move(n-1, b, a, c);     
         }         
     }
     /*  Function to display */
     public static void display()
     {
         System.out.println("  A  |  B  |  C");
         System.out.println("---------------");
         for(int i = N - 1; i >= 0; i--)
         {
             String d1 = " ", d2 = " ", d3 = " ";
             try
             {
                 d1 = String.valueOf(tower[1].get(i));
             }
             catch (Exception e){
             }    
             try
             {
                 d2 = String.valueOf(tower[2].get(i));
             }
             catch(Exception e){
             }
             try
             {
                 d3 = String.valueOf(tower[3].get(i));
             }
             catch (Exception e){
             }
             System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
         }
         System.out.println("\n");         
     }
}