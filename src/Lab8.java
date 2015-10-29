
public class Lab8 {

	public static void main(String[] args) {
		// TODO Create array
		/*int[][][][][][] world = new int[10][10][10][10][10][10];
		int x = -7;
		x = x%10;
		System.out.println(x);
		x = 10+x;
		System.out.println(x);*/
		
		World world = new World();
		Scientist scientist = new Scientist(world);
		System.out.println(world.getColor(3));

	}

}
