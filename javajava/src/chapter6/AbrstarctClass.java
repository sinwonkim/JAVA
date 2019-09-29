package chapter6;

public abstract class AbrstarctClass {

	//추상 클래스 
	
	// 사전적 의미로 추상(abstract)는 실체 간에 공통되는 특성을 추출한 것을 말한다. 
	// 여러개의 실체 클래스에서 공통되는 필드와 메소드를 따로 선언한 Animal.class 클래스를 만들 수 있는데 이것이 바로 추상 클래스라고 볼 수 있다.
	// 추상클래스는 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성해서 사용할 수 없다.
	// 다시 말해서 추상 클래스는 new연산자를 사용해서 인스턴스를 생성시키지 못한다. 
	
	//ex)  Animal이라는 추상 클래스 있으면 new Animal()   x 못한다.
	
	//추상 클래스의 용도  -> 실체적인 클래스들의 공통적인 특성(필드, 메소드)을 이름을 통일할 목적 
	// 실체 클래스를 설계하는 사람이 여러 사람일 경우, 실체 클래스마다 필드와 메소드가 제각기 다른 이름을 가질 수 있다. 
	// 두번째 실체 클래스를 작성할 때 시간을 절약 공통적인 필드와 메소드는 추상클래스에 모두 선언해 두고 실체 클래스마다 다른 점만 실체 클래스에
	// 선언하게 되면 실체클래스를 작성하는데 시간을 절약할 수 있다 
	
	public String owner;
	
	public AbrstarctClass(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켠다.");
	}
	
	public void turnOff( ) {
		System.out.println();
	}
	
	// 추상 메소드  선언부만 있고 메소드 실행 내용인 중괄호도 없고 추상클래스에서만 선언가능하다.
	abstract String abstartMethodEx();
}
