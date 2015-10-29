
public class Lab8 {

	public static void main(String[] args) {
		// TODO Calculate color
		
		World world = new World();
		Scientist scientist = new Scientist(world);
		scientist.move(1, 3);
		scientist.printLocation();
		
	}

}
