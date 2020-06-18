/**
* Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.
* Input:
* The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array).
* The subsequent line contains N-1 array elements.
* Output:
* Print the missing number in array.
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Miss {
    public static int findMiss(int n , int a[]){
        int sum=0;
        
        for(int i=0;i<n;i++){
           sum+=a[i];
          }
         int nsum= ((n+1)*(n+2))/2;


       
        return nsum-sum;
    }
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
           int n = sc.nextInt();
           int a[]= new int [n-1];
           for(int i=0;i<a.length ; i++)
              a[i]=sc.nextInt();
            System.out.println(Miss.findMiss(n-1, a));
            t--;
        }
    }
}
