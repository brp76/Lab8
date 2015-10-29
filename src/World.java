
public class World {
	private int[][][][][][] world = new int[10][10][10][10][10][10];
	public int color = 0;
	
	public World(){
		int counter = 0;
		for (int j=0; j < world.length; j++) {
		    for (int k=0; k< world[j].length; k++) {
		    	for (int l=0; l < world[j][k].length; l++) {
		    		for (int m=0; m < world[j][k][l].length; m++) {
		    			for (int n=0; n < world[j][k][l][m].length; n++) {
		    				for (int o=0; o < world[j][k][l][m][n].length; o++) {
		    					world[j][k][l][m][n][o] = counter++;
		    				}
		    			}
		    		}
		    	}
		    }
		}
	}
	
	public int[][][][][][] toArray() {
		return world;
	}

	public int getValue(int i, int n) {
		int val = 0;
		switch (i) {
		case 0:
			val = world[n][0][0][0][0][0];
			val /= 100000;
			break;
		case 1:
			val = world[0][n][0][0][0][0];
			val /= 10000;
			break;
		case 2:
			val = world[0][0][n][0][0][0];
			val /= 1000;
			break;
		case 3:
			val = world[0][0][0][n][0][0];
			val /= 100;
			break;
		case 4:
			val = world[0][0][0][0][n][0];
			val /= 10;
			break;
		case 5:
			val = world[0][0][0][0][0][n];
			break;
		}
		 
		return val;
	}
	
	public int getColor(int[] arr) {
		arr[5] = 0;
		for (int i = 0; i < arr.length-1; i++) {
			arr[5] += arr[i];
		}
		arr[5] %= 10;
		return arr[5];
	}
}
