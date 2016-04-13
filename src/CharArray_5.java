

public class CharArray_5 {
	
	public static void main(String[] args) {
		int i;
		boolean letter=false;
		String str="i got so much swag yall gonna regret when i noscope u";
		byte[] chard =str.getBytes();
		for(i=0;i<chard.length;i++)
		{
			if(chard[i]==32)letter=false;
			else
			{
				if(!letter)
				{
					chard[i]-=32;
					letter=true;
				}
			}
		}
		String nou= new String(chard);
		System.out.println(nou);
	}

}
