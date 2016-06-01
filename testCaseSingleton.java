package testeFacultate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.proiect_cts.Facultate;

public class testCaseSingleton {
	
	Facultate singletonFacultate;
	
	@Before
	public void setUp() {
		singletonFacultate = Facultate.getInstance();
	}
	

	@Test
	public void test() {
		Facultate testFac=Facultate.getInstance();
		assertEquals(singletonFacultate, testFac);
	}

}
