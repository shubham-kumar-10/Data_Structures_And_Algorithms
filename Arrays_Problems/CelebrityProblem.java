package Data_Structures_And_Algorithms.Arrays_Problems;
import java.util.Scanner;
public class CelebrityProblem {
    public int celebrity(int mat[][]) {

        int[] indegree=new int[mat.length];
        int[] outdegree=new int[mat.length];
        int n=mat.length;
        
        // A celebrity is someone for whom the indegree will be n-1 as known by n-1 people (excluding self) while the outdegree is 0 (excluding self)
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat.length;j++) {
                if(i==j)
                continue;
                indegree[j]+=mat[i][j];
                outdegree[i]+=mat[i][j]; 
            }
        }
        
        for(int i=0;i<n;i++) {
            if(indegree[i]==n-1 && outdegree[i]==0)
            return i;
        }
        return -1;

        // TC :O(N^2) 
        // SC :O(2N)  => O(N)
    }


    public static void main(String[] args) {
        // A celebrity is someone who is known by all but he does not anyone.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        CelebrityProblem cp=new CelebrityProblem();
        int result=cp.celebrity(mat);
        System.out.println(result);
        sc.close();
       
    }
}
