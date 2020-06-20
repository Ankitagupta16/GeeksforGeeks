/**
* Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
* Input:
* The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.
* Output:
* Print the maximum sum of the contiguous sub-array in a separate line for each test case.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int findMaxSum(int a[], int n) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
  
        for (int i = 0; i < n; i++) 
        { 
            max_ending_here = max_ending_here + a[i]; 
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        } 
        return max_so_far; 
    }
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        
        String line = br.readLine();
        int i = 0;
        for (String numStr: line.split("\\s")){
        a[i] = Integer.parseInt(numStr);
        i++;
        }
        
        System.out.println(findMaxSum(a,n));
        }
    }
}
