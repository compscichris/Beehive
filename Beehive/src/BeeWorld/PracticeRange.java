package BeeWorld;

public class PracticeRange {
	public static void main(String []args)
	{
		Bee bee1 = new Bee(new Coordinates(1,1,1), "United States", 1);
		Bee bee2 = new Bee(new Coordinates(4,4,4), "France", 1);
		System.out.println(bee1.toString());
		System.out.println(bee2.toString());
	}
}
