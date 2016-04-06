
public class Var20_II_5 {

	public static void main(String[] args) {
		int n=5,i,j;
		int [][]v= new int[n][n];
		for(i=0;i<n;i++)
		{
			v[0][i]=i+2;
			System.out.printf(v[0][i]+" ");
		}
		for(i=1;i<n;i++)
		{
			System.out.println();
			v[i][0]=i+2;System.out.printf(v[i][0]+" ");
			for(j=1;j<n;j++)
			{
				v[i][j]=v[i][j-1]+v[i-1][j];
				System.out.printf(v[i][j]+" ");
			}
		}
	}

}
