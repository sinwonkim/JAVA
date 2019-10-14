package BasicApi;

import java.util.Date;

public class BasicApiExample {

	public void getSysOut(){
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1.equals(obj2);
		System.out.println("comparison of object1 and object2 : "+result);
	}
	
	public static void main(String args[]) {
		BasicApiExample basicApiExample = new BasicApiExample();
		basicApiExample.getSysOut();
		
		Object object = new Object();
		System.out.println("toString Method return the value of the object"+object.toString());
		Date date = new Date();
		System.out.println("The current time is  " + date.toString());
	}
}
