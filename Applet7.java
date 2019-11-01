import java.util.*;
import java.applet.Applet;
import java.awt.*;

/*<applet code="MyApplet7" width="400" height="400" ></applet>*/
public class Applet7 extends Applet implements Runnable
{
	Thread t,t1;
	public void start()
	{
		t = new Thread(this);
		this.start();
	}
	public void sum()
	{
		t1 = Thread.CurrentThread();
		while(t1 == t)
		{
			repaint();
			try{
				t1.sleep(1000);
			}
			catch(InterruptedException e){}
		}
	}
	public void paint(Graphics g)
	{
		Calendar cal = new GregorianCalendar();
		String hour = String.ValueOf(cal.get(Calendar.HOUR));
		String minute = String.ValueOf(cal.get(Calendar.MINUTE));
		String second = String.ValueOf(cal.get(Calendar.SECOND));
		g.drawString(hour + ":" + minute + ":" + second,20,30);
	}
}
