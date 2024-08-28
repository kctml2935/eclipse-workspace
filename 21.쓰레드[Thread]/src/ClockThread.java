import java.util.Date;

public class ClockThread extends Thread{
	
	public ClockThread() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		while(true) {
			try {
				Date now = new Date();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
