package GFG.DynamicProgramming;

public class LCSubsequence
{
    public static int lcs1(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length(); ++i)
            for (int j = 0; j < s2.length(); ++j)
                if (s1.charAt(i) == s2.charAt(j)) dp[i + 1][j + 1] = 1 + dp[i][j];
                else dp[i + 1][j + 1] =  Math.max(dp[i][j + 1], dp[i + 1][j]);
        return dp[s1.length()][s2.length()];
    }
    public static int lcs2( char[] X, char[] Y, int m, int n )
    {
        if (m == 0 || n == 0)
            return 0;
        if (X[m-1] == Y[n-1])
            return 1 + lcs2(X, Y, m-1, n-1);
        else
            return max(lcs2(X, Y, m, n-1), lcs2(X, Y, m-1, n));
    }
    public static int max(int a, int b)
    {
        return (a > b)? a : b;
    }

    public static void main(String[] args)
    {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " "+lcs1( "abcde","ace"));
        System.out.println("Length of LCS is" + " " + lcs2( X, Y, m, n ) );
    }

}