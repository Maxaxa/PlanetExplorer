package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	PlanetExplorer explorerNoObs;
	@Before
	public void setup(){
		explorerNoObs = new PlanetExplorer(3,3,"");
	}

	@Test
	public void testGetPositionStartingPosition_return0_0() {
		
		String position = explorerNoObs.getPosition();
		assertEquals("0,0", position);
	}
	
	@Test
	public void testGetFacingStartingPosition_returnN(){
		PlanetExplorer explorerNoObs = new PlanetExplorer(100,100,"");
		char facing = explorerNoObs.getFacing();
		assertEquals('N', facing);
	}
	@Test
	public void testTurn_Right_ReturnW(){
		explorerNoObs.executeCommand("r");
		char facing = explorerNoObs.getFacing();
		assertEquals('W', facing);
	}
	@Test
	public void testTurn_Left_ReturnE(){
		explorerNoObs.executeCommand("l");
		char facing = explorerNoObs.getFacing();
		assertEquals('E', facing);
	}
	@Test
	public void testTurn_RightRight_ReturnS(){
		explorerNoObs.executeCommand("rr");
		char facing = explorerNoObs.getFacing();
		assertEquals('S', facing);
	}
	@Test
	public void testTurn_LeftLeft_ReturnS(){
		explorerNoObs.executeCommand("ll");
		char facing = explorerNoObs.getFacing();
		assertEquals('S', facing);
	}
	@Test
	public void testMove_Forward_Return0_1(){
		explorerNoObs.executeCommand("f");
		String position = explorerNoObs.getPosition();
		assertEquals("0,1", position);
	}
	@Test
	public void testMove_ForwardForward_Return0_2(){
		explorerNoObs.executeCommand("ff");
		String position = explorerNoObs.getPosition();
		assertEquals("0,1", position);
	}
	
}
