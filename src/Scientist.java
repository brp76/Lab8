
public class Scientist {
	private int[][][][][][] world = new int[10][10][10][10][10][10];
	private int location[] = {0,0,0,0,0,0};
	public Scientist(World w) {
		world = w.toArray();
		for (int i = 0; i < location.length; i++) {
			location[i]=world[0][0][0][0][0][0];
		}
		
	}
	
	public int[] move(int dimension, int numInts) {
		
		// Make sure number is between 0 and 9
		numInts = numInts%10;
		// Check negative
		if(numInts<0) {
			numInts = 10+numInts;
		}
		
		// Move location
		int i = dimension-1;
		location[i] += numInts;
		
		return location;
	}
	
	public void printLocation() {
		System.out.print("Location: [");
		for (int i = 0; i < location.length-2; i++) {
			System.out.print(location[i]+" ");
		}
		System.out.print(location[4]+"]");
	}
}
