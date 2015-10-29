
public class World {
	private int[][][][][][] world = new int[10][10][10][10][10][10];
	
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
	
	public int getColor(int loc){
		
		return world[0][0][0][0][0][loc];
	}
	
	public int position(int a, int b, int c, int d, int e, int f) {
		return world[a][b][c][d][e][f];
	}
	
	public int[][][][][][] toArray() {
		return world;
	}
	
}
