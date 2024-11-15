package ch08_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;  // 이건 가능. 인터페이스는 객체는 인스턴스화 불가능. 생성자 자체가 없음. = new Animal 안됨
		
		Dog dog = new Dog();  // 인스턴스화 가능(메모리에 객체 생성 가능). 
		animal = dog;  // 부모는 자식의 모든 것을 받아준다
		Eagle eagle = new Eagle();
		animal = eagle;  // 인터페이스 변수에 자식 클래스로 만든 구현 객체 대입
		
		eagle.eat();
		
		BlackEagle blackEagle = new BlackEagle();
		animal = blackEagle;  // 인터페이스 변수에 자식 클래스에서 상속 받은 손자 클래스 객체도 대입 가능  . 이것 까지는.....
		animal.cry();
		
		Puddle puddle = new Puddle(); // 부모가 Dog 클래스
		dog = puddle;
		puddle = (Puddle) dog;
		
		animal = dog;  // 백엔드에서 이 정도 까지는 ......
		dog = (Dog) animal; 
		
		dog.tail();
	}

}
