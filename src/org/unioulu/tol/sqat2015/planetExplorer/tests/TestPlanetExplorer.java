package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testGetPositionStartingPosition_return0_0() {
		PlanetExplorer explorer = new PlanetExplorer(100,100,"");
		String position = explorer.getPosition();
		assertEquals("0,0", position);
	}
	
	@Test
	public void testGetFacingStartingPosition_returnN(){
		PlanetExplorer explorer = new PlanetExplorer(100,100,"");
		char facing = explorer.getFacing();
		assertEquals('N', facing);
	}
}
