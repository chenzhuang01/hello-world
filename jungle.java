package jungle;

public class jungle {
	public static void main(String[] args) {
		int HP=0,i,j=5;
		for(i=5;i>0;i--)
			for(j=5;j>0;j--)
		{
			if(HP==0)
			{
				j--;
			    HP++;
			}
			
			HP++;
			HP=HP/2;
			
		}
		System.out.println("女警的初始血量为："+HP);	
	}

}
