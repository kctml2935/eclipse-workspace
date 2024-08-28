class DownloadThread extends Thread{
	@Override
	public void run() {
		try {
			for(int i=0; i<=100; i++) {
				System.out.println("downloading...["+i+"%]");
				Thread.sleep(10);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" thread가 jvm return thread end");
		return;
	}
}


class GameThread extends Thread{
	private boolean isPlay;
	public GameThread() {
		isPlay=true;
	}
	@Override
	public void run() {
		while(isPlay) {
			try {
				System.out.println("-------------------------------");
				System.out.println("1.game move");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("2.game fight");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("3.game get scoe!");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("4.game power up");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("5.game score update");
				Thread.sleep((int)(Math.random()*1000)+1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}



public class ControlStopThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1.main");
		DownloadThread downloadThread = new DownloadThread();
		downloadThread.setName("<<download thread>>");
		downloadThread.start();
		
		System.out.println("------GameThread start------");
		GameThread gameThread = new GameThread();
		gameThread.start();
		
		downloadThread.join();
		gameThread.join();
		System.out.println("9.main thread jvm return end");
		
		
		
	}

}
