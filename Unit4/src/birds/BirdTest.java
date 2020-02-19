package birds;

public class BirdTest {

	public static void main(String[] args) {
		
		Canary canary1 = new Canary('M', 21, 22.4);
		canary1.whoAmI();
		System.out.println(Bird.birdNum());
		canary1.height();
		System.out.println();
		
		Parrot parrot1 = new Parrot('F', 13, 'W');
		parrot1.whoAmI();
		System.out.println(Bird.birdNum());
		parrot1.whereAreYouFrom();
	}

}
