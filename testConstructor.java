package testeStudent;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.proiect_cts.Student;

public class testConstructor {
	
	Student stud;

	@Test
	public void testConstructorValoriNormale() {
		int nrMatricol=100;
		String nume="Gigica";
		String prenume="Popica";
		String cnp="1920306086675";
		int taxa=2100;
		String formaInvatamant="zi";
		String specializare="Statistica";
		
		stud=new Student(nrMatricol,nume,prenume,cnp,taxa,formaInvatamant,specializare);
		
		assertEquals("Verificare constructor nrMat",nrMatricol,stud.getNrMatricol());
		assertEquals("Verificare constructor nume",nume,stud.getNume());
		assertEquals("Verificare constructor prenume",prenume,stud.getPrenume());
		assertEquals("Verificare constructor cnp",cnp,stud.getCnp());
		assertEquals("Verificare constructor taxa",taxa,stud.getTaxa());
		assertEquals("Verificare constructor formaInv",formaInvatamant,stud.getFormaInvatamant());
		assertEquals("Verificare constructor specizliare",specializare,stud.getSpecializare());
		
	}
	
	@Test
	public void testConstructorNumeNull() {
		String nume=null;
		int nrMatricol=100;
		String prenume="Popica";
		String cnp="1920306086675";
		int taxa=2100;
		String formaInvatamant="zi";
		String specializare="Statistica";
		try{
			stud=new Student(nrMatricol,nume,prenume,cnp,taxa,formaInvatamant,specializare);
			fail("Lipsa exceptie pe nume=null");
		}
		catch (Exception e)
		{
		
		}
		
		
	}

}
