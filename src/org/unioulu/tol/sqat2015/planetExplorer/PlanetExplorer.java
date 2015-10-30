package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 112
// Finish time:
public class PlanetExplorer {
	int[][] grid;
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		grid = new int[x][y];
	}
	int positionx = 0;
	int positiony = 0;
	int facing = 0;
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		if (command == "r"){
			facing = facing++;
		}
		
		return null;
	}
	

	public String getPosition() {
		String position = positionx + "," + positiony;
		return position;
	}

	public char getFacing() {
		char facingChar = 'z';
		
		switch (facing){
		case 0: facingChar = 'N';
			break;
		case 1: facingChar = 'W';
			break;
		case 2: facingChar = 'S';
			break;
		case 3: facingChar = 'O';
			break;
		}
		
		return facingChar;
	}
}
