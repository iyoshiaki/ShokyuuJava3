
public class kadai extends MyFrame
{
	public void run()
	{
		setColor(0,128,0);
	
		for(int i=0,x = 30,y = 80,h = 10,n = 120;i<10;i++)
		{
			 fillRect(x,y,h,n);
			 x+=20;
			 n-=10;
		}
		for(int i=0,x = 30,y = 250,h = 10,n = 20;i<10;i++)
		{
			 fillRect(x,y,h,n);
			 x+=20;
			 y-=10;
			 n+=10;
		}
	}

}
