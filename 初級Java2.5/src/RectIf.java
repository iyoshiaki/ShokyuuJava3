
public class RectIf extends MyFrame
{
	public void run()
	{
		int x=30;
		setColor(0,128,0);
		int i;
		int takasa = 10;
		for (i=0 ; i<9 ; i++)
		{
			fillRect(x,80,10,takasa);
			x+=20;
			takasa+=20;
		}
	}

}
