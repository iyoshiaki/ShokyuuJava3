
public class RectIf extends MyFrame
{
	public void run()
	{
		int x=30;
		int i;
		int iro = 0;
		for (i=0 ; i<9 ; i++)
		{
			setColor(iro,iro,iro);
			fillRect(x,80,10,100);
			x+=20;
			iro+=20;
		}
	}

}
