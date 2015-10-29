
public class Scientist {
	private int[][][][][][] world = new int[10][10][10][10][10][10];
	private int location[] = {0,0,0,0,0,0};
	public Scientist(World w) {
		world = w.toArray();
		for (int i = 0; i < location.length-1; i++) {
			location[i]=world[0][0][0][0][0][0];
		}
		System.out.println("0: " + location[0]);
		System.out.println("1: " + location[1]);
		System.out.println("2: " + location[2]);
		System.out.println("3: " + location[3]);
		System.out.println("4: " + location[4]);
		System.out.println("5: " + location[5]);
		
	}
	
	/*public int[] move(int dimension, int numInts) {
		location=world[0][0][0][0][0][0];
		int x[][][][][][] = world[1];
		return x;
	}*/
}
