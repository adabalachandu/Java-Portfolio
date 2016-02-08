/*
You are given two integer arrays, A and B, each containing N integers. 
The size of the array is less than or equal to 1000. 
You are free to permute the order of the elements in the arrays. 

Now here's the real question: Is there an permutation A', B' possible of A and B, such that, A'i+B'i ≥ K for all i, 
where A'i denotes the ith element in the array A' and B'i denotes ith element in the array B'.


Input Format
 The first line contains an integer, T, the number of test-cases. T test cases follow. 
 Each test case has the following format:

The first line contains two integers, N and K. The second line contains N space separated integers, denoting array A. 
The third line describes array B in a same format.

Output Format
 For each test case, if such an arrangement exists, output "YES", otherwise "NO" (without quotes).


Constraints
 1 <= T <= 10
 1 <= N <= 1000
 1 <= K <= 10^9
 0 <= Ai, Bi ≤ 10^9



Sample Input

2
3 10
2 1 3
7 8 9
4 5
1 2 2 1
3 3 3 4



Sample Output

YES
NO


Explanation

The first input has 3 elements in Array A and Array B, we see that the one of the arrangements, 
3 2 1 and 7 8 9 has each pair of elements (3+7, 2 + 8 and 9 + 1) summing upto 10 and hence the answer is "YES". 

The second input has array B with three 3s. So, we need at least three numbers in A that are greater than 1. 
As this is not the case, the answer is "NO". 
*/

import java.io.*;
import java.util.*;

public class ArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i < t; i++){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            sc.nextLine();
            int[] a = new int[n];
            int[] b = new int[n];
            int j=0;
            for(j=0; j<n; j++){
                a[j] = sc.nextInt();
            }
            sc.nextLine();
            for(j=0; j<n; j++){
                b[j] = sc.nextInt();
            }
            if(sc.hasNext())
                sc.nextLine();
            Arrays.sort(a);
            Arrays.sort(b);
            for(j=0; j<n; j++){
                if(a[j]+b[n-j-1] < sum) break;
            }
            if(j==n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}