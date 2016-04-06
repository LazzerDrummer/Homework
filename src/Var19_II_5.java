
public class Var19_II_5 {

	public static void main(String[] args) {
		int n=5,i,j;
		int [][]v= new int[n][n];
		for(i=0;i<n;i++)
		{
			System.out.println();
			for(j=0;j<n;j++)
			{
				if(j%2==0)
				{
					v[i][j]=i+j+2;
					System.out.printf(v[i][j]+" ");
				}
				else
				{
					v[i][j]=i+1;
					System.out.printf(v[i][j]+" ");
				}
			}
		}

	}

}
