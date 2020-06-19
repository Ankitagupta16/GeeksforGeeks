/**
* Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
* Input:
* The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.
* Output:
* For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".
*/


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0)
		{
		    int n = in.nextInt();
		    int[] a= new int[n];
		    for(int i =0;i< n; i++)
		        a[i]= in.nextInt();
		    Arrays.sort(a);
	        int i;
	        int count =0;
            for(i=n-1; i>1; i--)
            {
                int j = 0;
                int k = i-1;
                while(j<k)
                {
                    if(a[j]+a[k] == a[i])
                    {
                        count++ ;
                        j++;
                        k--;
                        
                    }
                    else if(a[j]+a[k] < a[i])
                    j++;
                    else
                    k--;
                }
    
            }
            if(count!=0)
            System.out.println(count);
            else
            System.out.println(-1);
		     t--;
		}
	}
}
