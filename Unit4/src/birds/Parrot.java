package birds;

public class Parrot extends Bird{

	char region;
	
	Parrot(char sex, int age, char region) {
		super(sex, age);
		this.region = region;
	}
	
	void whereAreYouFrom() {
		String parrotRegion;
		if(region == 'N') {
			parrotRegion = "North";
		}
		else if (region == 'S') {
			parrotRegion = "South";
		}
		else if (region == 'E') {
			parrotRegion = "East";
		}
		else {
			parrotRegion = "West";
		}
		System.out.println("This parrot is from the "+parrotRegion+".");
	}
}
