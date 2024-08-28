class ControlJoinThread extends Thread{
	private int start;
	private int end;
	private int total;
	
	public ControlJoinThread(int start, int end) {
		this.start=start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i = start;i<=end;i++) {
			total+=i;
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}

public class ControlJoinThreadMain {

	public static void main(String[] args) throws Exception {
		ControlJoinThread controlJoinThread1= new ControlJoinThread(1, 50);
		ControlJoinThread controlJoinThread2= new ControlJoinThread(51, 100);
		
		controlJoinThread1.start();
		controlJoinThread2.start();
		
		controlJoinThread1.join();
		controlJoinThread2.join();
		
		int lastTotal = controlJoinThread1.getTotal()+controlJoinThread2.getTotal();
		
		System.out.println("controlJoinThread1:"+controlJoinThread1.getTotal());
		System.out.println("controlJoinThread2:"+controlJoinThread2.getTotal());
		System.out.println("lastTotal="+lastTotal);
		
		
		
	}

}
