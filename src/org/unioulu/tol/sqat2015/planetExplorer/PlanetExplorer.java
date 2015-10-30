package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 112
// Finish time:
public class PlanetExplorer {
	int[][] grid;
	int x;
	int y;
	public PlanetExplorer(int x, int y, String obstacles){
		this.x = x;
		this.y = y;
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		grid = new int[x][y];
	}
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}
	int positionx;
	int positiony;
	int facing;
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		char[] commandArray = command.toCharArray();
		
		for(char SingleCommand :commandArray){
			if (SingleCommand == 'r' || SingleCommand == 'l'){
				turn(SingleCommand);
			}else if(SingleCommand == 'f' || SingleCommand == 'b')
			move(SingleCommand);
		}
		
		return null;
	}


	private void move(char SingleCommand) {
		if(SingleCommand == 'f'){
			if(getFacing() == 'N' || getFacing() == 'S' ){
				positiony++;
				if(positiony > getY()){
					positiony = 0;
				}
			}
			if(getFacing() == 'W' || getFacing() == 'E' ){
				positionx++;
			}
			
		}else if(SingleCommand == 'b'){
			if(getFacing() == 'N' || getFacing() == 'S' ){
				positiony--;
			}
			if(getFacing() == 'W' || getFacing() == 'E' ){
				positionx--;
			}
			
		}
	}


	private void turn(char command) {
		if (command == 'r'){
			facing = (facing+1)%4;
			
		}else if (command == 'l'){
			facing = facing-1;
			if(facing<0){
				facing = facing +4;
			}
		}
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
		case 3: facingChar = 'E';
			break;
		}
		
		return facingChar;
	}
}
