package threadTest;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		//1부터 10까지 더해서 결과 출력하기
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
			System.out.println(i+"더한 결과" + sum);
		}
		System.out.println("----------------------");
		System.out.println("1~10까지의 합계 : " + sum);
	}
}
