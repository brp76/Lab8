
public class Scientist {
	private World w5 = new World();
	private int location[] = {0,0,0,0,0,0};
	
	public Scientist(World w) {
		w5 = w;
	}
	
	public int[] move(int dimension, int numUnits) {		
		int i = dimension - 1;
		numUnits += location[i];
		// Make sure number is between 0 and 9
		numUnits = numUnits%10;
		// Check negative
		if(numUnits<0) {
			numUnits = 10+numUnits;
		}
		
		// Move location
		location[i] = w5.getValue(i,numUnits);
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
