//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String S) {
        int ans = 0;
            int close = 0;
            int open = 0;
            int n = S.length();
            
            for(int i = 0;i < n; i++){
                char x = S.charAt(i);
                if(x == '(') open ++;
                else close++;
                if( close == open) ans = Math.max(ans, open);
                else if(close > open) close = open = 0;
            }
            
            close = open = 0;
            
            for(int i = n-1; i >= 0; i--){
                
                char x = S.charAt(i);
                if(x == '(') open ++;
                else close++;
                if( close == open) ans = Math.max(ans, open);
                else if(open > close) close = open = 0;
                
            }
              
             return 2 * ans;

    }
};