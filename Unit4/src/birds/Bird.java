package birds;

public abstract class Bird {

	char sex;
	int age;
	static int birdsNum;
	
	Bird(char sex, int age){
		this.sex = sex;
		this.age = age;
		birdsNum++;
	}
	
	static int birdNum() {
		return birdsNum;
	}
	
	void whoAmI() {
		System.out.println("Age: "+age+"\n"+"Sex: "+sex);
	}
}
