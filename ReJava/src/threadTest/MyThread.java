package threadTest;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		//1���� 10���� ���ؼ� ��� ����ϱ�
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
			System.out.println(i+"���� ���" + sum);
		}
		System.out.println("----------------------");
		System.out.println("1~10������ �հ� : " + sum);
	}
}
