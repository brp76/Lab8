
public class Lab8 {

	public static void main(String[] args) {
		// TODO Calculate color
		
		World world = new World();
		
		
		Scientist scientist = new Scientist(world);
		
		System.out.println("Moving 1st dimension 3 spots:");
		scientist.move(1, 3);
		
		
		System.out.println("Moving 3rd dimension -14 spots:");
		scientist.move(3, -14);
		
		
	}

	
}
