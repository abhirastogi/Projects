class abh
{
    void main(int n)
    {
        int a=n,b=2*n-1;
        
        String ar[][]=new String[a][b];
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<b;c++)
            {
                if(r+c<(n-1))
                ar[r][c]=" ";
                else if((r+c)==(n-1))
                ar[r][c]="*";
                else if((r+c)>((n-1)*(r+1)))
                ar[r][c]=" ";
                else
                ar[r][c]="*";
            }
        }
        for(int r=0;r<a;r++)
        {
            for(int c=0;c<b;c++)
            {
                System.out.print(ar[r][c]);
            }
            System.out.println();
        }
    }
}
    