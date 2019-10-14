
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
			findCl();
		} catch (ClassNotFoundException e) {
			System.out.println("예외 발생함");
		}
	}
		
		public static void findCl() throws ClassNotFoundException {
			Class clazz = Class.forName("asdasd");
		}
	}

