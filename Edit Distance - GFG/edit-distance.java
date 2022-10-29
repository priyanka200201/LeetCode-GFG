//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] arr = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 && j==0){
                    arr[i][j] = 0;
                }
                else if(i==0){
                    arr[i][j] = arr[i][j-1] + 1;
                }
                else if(j==0){
                   arr[i][j] = arr[i-1][j] + 1;
                }
                else{
                    char ch1 = s.charAt(i-1);
                    char ch2 = t.charAt(j-1);
                    if(ch1==ch2)
                        arr[i][j] = arr[i-1][j-1];
                    else
                        arr[i][j] = 1 + Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]));
                }
            }
        }
        return arr[n][m];

    }
}