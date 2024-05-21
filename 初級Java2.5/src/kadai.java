
public class kadai extends MyFrame
{
	public void run()
	{	
		setColor(0,128,0);
		int x = 30;
		int y = 20;
		int a = 30;
		while(y<400)
		{
			fillRect(x,y,a,a);
			x = x+a;
			y = y+a;
			a+=10;
		}
	}

}
