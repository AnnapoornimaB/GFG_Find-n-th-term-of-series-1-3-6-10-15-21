class Solution 
{
    static int findNthTerm(int N)
    {
        int r = 0;
        for(int i=1;i<=N;i++)
        {
            r += i;
        }
        return r;
    }
}
