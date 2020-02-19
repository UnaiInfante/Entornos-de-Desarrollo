package birds;

public class Tweety extends Canary{

	int movieAppearances;
	
	Tweety(char sex, int age, double size, int appearances) {
		super(sex, age, size);
		movieAppearances = appearances;
	}
	
	public static void main(String[] args) {
		
		Tweety tweety1 = new Tweety('F', 10, 11.3, 5);
		Parrot parrot1 = new Parrot('M', 24, 'S');
		
		tweety1.whoAmI();
		tweety1.height();
		System.out.println();
		parrot1.whoAmI();
		parrot1.whereAreYouFrom();
		System.out.println();
		tweety1.size = 16.6;
		tweety1.height();
		System.out.println();
		parrot1.region = 'W';
		parrot1.whereAreYouFrom();
		System.out.println();
		System.out.println("Num of birds: "+Bird.birdNum());
	}
}
