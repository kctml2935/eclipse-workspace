
class MainThreadCalled{
	public void main_thread_called_method() {
		System.out.println("\tA."+Thread.currentThread().getName()+" 쓰레드 실행");
		System.out.println("\tB."+Thread.currentThread().getName()+" 쓰레드 반환");
		return;
	}
}

public class MainThreadMain {

	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread currentThread = Thread.currentThread();
		System.out.println("main thread name:"+currentThread.getName());
		System.out.println("main thread priority:"+currentThread.getPriority());
		MainThreadCalled mainThreadCalled = new MainThreadCalled();
		mainThreadCalled.main_thread_called_method();
		System.out.println("main thread jvm return");
		return;
		
		
		
		
		
		
		

	}

}
