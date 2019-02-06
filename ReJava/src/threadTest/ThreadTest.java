package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
	//스레드를 만들어서  1~100까지의 합계를 구하게 일을 시킨다.
	 Thread t = new MyThread();
	 t.start();
	 // main스레드에서는  1~10까지 곱해서 결과를 출력하게 한다.
	 long multiplay = 1;
	 for(long i = 1; i<=10; i++) {
		 multiplay *= i;
		 System.out.println(i +"곱하기 결과" + multiplay);
	 }
	 
	 System.out.println("------------------------------------");
	 System.out.println("1~10 곱하기"+multiplay);
	}
}
