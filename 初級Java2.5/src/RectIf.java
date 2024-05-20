
public class RectIf extends MyFrame
{
	public void run()
	{
		int x=30;
		setColor(0,128,0);
		int i;
		int y=80;
		for (i=0 ; i<9 ; i++)
		{
			fillRect(x,y,10,100);
			x+=20;
			y+=20;
		}
	}

}
