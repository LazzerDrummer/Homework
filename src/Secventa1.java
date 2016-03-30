
public class Secventa1 {

	public static void main(String[] args) {
		
		int [] x={8,5,8,5,2,3,10,7,1,6};
		int [] y={8,5,2,3,10,7};
		int i,p=0;
		for(i=1;i<=x.length-1;i++)
		{
			if(x[i]==y[0])
			{
				i++;p=i;
				for(int j=1;j<=y.length-1 && i<=x.length-1;j++)
				{
					if(y[j]!=x[i])
					{
						System.out.println("NU");return;
					}
					i++;
				}
				if(i==x.length){System.out.println("NU");return;}
			}
		}
		System.out.println(p);
		
				
	}

}
