import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Calculate color
		
		World world = new World();
		Scientist scientist = new Scientist(world);
		
		Scanner sc = new Scanner(System.in);
		int dimension = 0;
		int numUnits = 0;
		
		do {
			System.out.print("Enter dimension to travel (1,2,3,4,5) (negative to quit) > ");
			dimension = sc.nextInt();
			while (dimension < 0 || dimension > 5) {
				if (dimension < 0) {
					System.out.println("The scientist gives up on the quest for understanding.");
					sc.close();
					System.exit(0);
				}
				System.out.print("Enter dimension to travel (1,2,3,4,5) (negative to quit) > ");
				dimension = sc.nextInt();
			}
			
			System.out.print("Enter units to travel (negative for backwards) > ");
			numUnits = sc.nextInt();
			
			scientist.move(dimension, numUnits);
			
		} while (dimension > 0);
		sc.close();
	}

}
