
public class Scientist {
	private World w5 = new World();
	private int location[] = {0,0,0,0,0,0};
	
	public Scientist(World w) {
		w5 = w;
	}
	
	public int[] move(int dimension, int numInts) {		
		int i = dimension - 1;
		numInts += location[i];
		// Make sure number is between 0 and 9
		numInts = numInts%10;
		// Check negative
		if(numInts<0) {
			numInts = 10+numInts;
		}
		System.out.println(numInts);
		
		// Move location
		location[i] = w5.getValue(i,numInts);
		int color = w5.getColor(location);
		String colorS = convertColor(color);
		printLocation(colorS);
		
		return location;
	}
	
	private static String convertColor(int c) {
		String s;
		if (c == 1) {
			s = "Lime";
		} else if (c == 2) {
			s = "Cerulean";
		} else if (c == 3){
			s = "Goldenrod";
		} else {
			s = "Black";
		}
		return s;
	}
	
	private void printLocation(String c) {
		System.out.print("Location: [");
		for (int i = 0; i < location.length-2; i++) {
			System.out.print(location[i]+" ");
		}
		System.out.println(location[4]+"] = "+c);
	}
	
}
