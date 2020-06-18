/**
* Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
* Input:
* The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. 
* Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. 
* The second line of each test case contains N space separated integers denoting the array elements.
* Output:
* For each testcase, in a new line, print the starting and ending positions(1 indexing) of 
* first such occuring subarray from the left if sum equals to subarray, else print -1.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int subArray(int n ,int s, int arr[])
    {
        int sum, i, j; 
        for (i = 0; i < n; i++) { 
            sum = arr[i]; 
            for (j = i + 1; j <= n; j++) { 
                if (sum == s) { 
                    System.out.println( i+1 +" " + j); 
                    return 0;
                } 
                if (sum > s|| j == n) 
                    break; 
                sum = sum + arr[j]; 
            } 
        }
        System.out.println(-1);
        return -1;
    }
    
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
           int n = sc.nextInt();
           int s = sc.nextInt();
           int a[] = new int [n];
           for(int i=0; i<n ; i++)
              a[i]=sc.nextInt();
            GFG.subArray(n,s, a);
            t--;
        }
    }
}
