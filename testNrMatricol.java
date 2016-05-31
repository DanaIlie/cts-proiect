package testeStudent;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.proiect_cts.Student;

public class testNrMatricol {

	Student stud;
	

	@Test
	public void testSubNrMatMinim(){
		int nrMatricolNou = 0;
		try{
		stud.setNrMatricol(nrMatricolNou);
		fail("Accepta nrMatricol < 0");
		}
		catch(Exception e){
			
		}
	
	}

}
