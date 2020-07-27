import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            list.add(ele);
        }
        
        /* Perfrom queries on Linked List  */
        int q= sc.nextInt();
        for (int i = 0; i < q; i++) 
        {
            String s = sc.next();
            if (s.equals("Insert")) 
            {
                int index = sc.nextInt();
                int val = sc.nextInt();
                list.add(index, val);
            } 
            else 
            { 
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        
        for(Integer I:list) 
        {
            System.out.print(I+ " ");
        }
    }
}
