
public class Lab8 {

	public static void main(String[] args) {
		// TODO Calculate color
		
		World world = new World();
		int colorI = 0;
		String colorS = "";
		
		Scientist scientist = new Scientist(world);
		System.out.println("Moving 1st dimension 3 spots:");
		scientist.move(1, 3);
		scientist.printLocation();
		colorI = scientist.getColor();
		colorS = convertColor(colorI);
		System.out.println(" = " + colorS);
		System.out.println("Moving 3rd dimension -14 spots:");
		scientist.move(3, -14);
		scientist.printLocation();
		colorI = scientist.getColor();
		colorS = convertColor(colorI);
		System.out.println(" = " + colorS);
		
	}

	public static String convertColor(int i) {
		String s;
		if (i == 1) {
			s = "Lime";
		} else if (i == 2) {
			s = "Cerulean";
		} else if (i == 3){
			s = "Goldenrod";
		} else {
			s = "Black";
		}
		return s;
	}
}
