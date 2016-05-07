
public class matrice {

	public static void main(String[] args) {
		int i,j;
		int [][]v=new int[][]{{14,1,0,1},
							  {0,28,1,8},
							  {0,3,18,8},
							  {1,0,2,89}};
		for(i=0;i<v.length-1;i++)
		{
			for(j=i;j>=0;j--)
			{
				if(v[j+1][j+1]<v[j][j])
				{
					switchLines(v, j);
					switchColumns(v, j);
				}
				else break;
			}
		}
		printMatricePatrata(v);

	}
	
	public static void switchLines(int [][]v,int i) {
		int j,aux;
		
			for(j=0;j<v.length;j++)
			{
				aux=v[i+1][j];
				v[i+1][j]=v[i][j];
				v[i][j]=aux;
			}
	}
			
		
	public static void switchColumns(int [][]v,int i) {
		int j,aux;
		
			for(j=0;j<v.length;j++)
			{
				aux=v[j][i+1];
				v[j][i+1]=v[j][i];
				v[j][i]=aux;
			}
	}
	
	public static void printMatricePatrata(int [][]v) {
		int i,j;
		for(i=0;i<v.length;i++)
		{
			System.out.println();
			for(j=0;j<v.length;j++)
			{
				System.out.printf(v[i][j]+" ");
			}
		}
	}
	

}
