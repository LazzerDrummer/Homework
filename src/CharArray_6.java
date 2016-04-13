
public class CharArray_6 {

	public static void main(String[] args) {
		int i,j;
		String str="AaagaaIi  ";
		byte[] chard =str.getBytes();
		char[] vocale={'a','e','o','u','i'};
		boolean consoana=true;
		for(i=chard.length-1;i>=0;i--)
		{
			if(chard[i]!=32)
			{
				for(j=0;j<vocale.length;j++)
				{
					if(chard[i]==vocale[j] || chard[i]==(vocale[j]-32))
					{
						consoana=false;break;
					}
					else consoana=true;
				}
				if(consoana)
				{
					System.out.println((char)chard[i]);
					System.out.println(i);
					break;
				}
			}
			else continue;
		}

	}

}
