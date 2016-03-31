

public class Arhitectura2 {

	public static void main(String[] args) {
		int []v={5,10,10,9,5,1,5,8,5,2};
		int i,j,aux=0;
		for(i=0;i<v.length-1;i++)
		{
			for(j=i;j>=0;j--)
			{
				if(v[j+1]>v[j])
				{
					aux=v[j+1];
					v[j+1]=v[j];
					v[j]=aux;
				}
				else break;
			}
		}
		for(i=0;i<v.length;i++)
		{
			System.out.printf(v[i]+ " ");
		}
		System.out.println();
		System.out.printf("0 ");
		for(i=1;i<v.length-1;i++)
		{
			if((v[i-1]+v[i+1])/2==v[i])
			{
				System.out.printf("1 ");
			}
			else System.out.printf("0 ");
		}
		if(v[v.length-1]*2==v[v.length-2])
		{
			System.out.printf("1 ");
		}
		else System.out.printf("0 ");

	}

}
