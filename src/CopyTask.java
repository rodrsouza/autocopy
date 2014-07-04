import java.util.Timer;
import java.util.TimerTask;


public class CopyTask
{
	private String source;
	private String destiny;
	
	public void setSource(String source)
	{
		this.source = source;
	}

	public void setDestiny(String destiny)
	{
		this.destiny = destiny;
	}

	public CopyTask()
	{
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask()
		{	
			@Override
			public void run()
			{
				
			}
		};
		
		timer.scheduleAtFixedRate(timerTask, 5000, 5000);
	}
}
