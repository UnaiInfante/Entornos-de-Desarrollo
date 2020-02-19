package birds;

public class Canary extends Bird{

	double size;
	
	Canary(char sex, int age){
		super(sex, age);
	}
	
	Canary(char sex, int age, double size){
		super(sex, age);
		this.size = size;
	}
	
	void height() {
		String height;
		if (size > 30) {
			height = "High";
		}
		else if (size < 15) {
			height = "Little";
		}
		else {
			height = "Middle";
		}
		System.out.println("This Canary is "+height+".");
	}
}
