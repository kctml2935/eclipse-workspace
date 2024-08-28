/*
type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
		동사원형:public void run()
		- 쓰레드가 실행할 코드
	3. Thread 객체를 생성한다.
	4. Thread 객체를통해서 Thread를 시작시킨다.
*/	
class CreateCustomThread extends Thread{
	/*
	 * public void run()
	 *  - CreateCustomThread객체를 통해서생성된 쓰레드가 호출하는 메쏘드
	 */
	@Override
	public void run() {
		while(true) {
		System.out.println("가."+Thread.currentThread().getName()+" 쓰레드 실행시작");
		System.out.println("나."+Thread.currentThread().getName()+" 쓰레드 실행종료");
		}
	}
}



public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main thread start");
		System.out.println("2.main thread createCustomThread 쓰레드객체생성");
		CreateCustomThread createCustomThread = new CreateCustomThread();
		createCustomThread.setName("사용자정의쓰레드");
		System.out.println("3.main thread가 createCustomThread 쓰레드객체시작");
		createCustomThread.start();
		while(true) {
		System.out.println("4.main thread");
		}

	}

}
