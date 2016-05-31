package testeStudent;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.proiect_cts.Student;


public class testAdaos {

	@Test
	public void testAdaosGeneral() {
		Student s=new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
	
		float adaos = 0;

		if (s.getSpecializare().equalsIgnoreCase("info")) {
			adaos = (float) (s.getTaxa() * 0.3);
			
		} else {
			if (s.getSpecializare().equalsIgnoreCase("cibe")) {
				adaos = (float) (s.getTaxa() * 0.2);
				

			} else {

				adaos = (float) (s.getTaxa() * 0.05);
				
			}

	}

		assertEquals(adaos,s.adaosTaxa(),0);
}
	
	@Test
	public void testAdaosInfo(){
		Student s=new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		
		float adaos = (float) (s.getTaxa() * 0.3);
		assertEquals(adaos,s.adaosTaxa(),0);
	}
	
	@Test
	public void testAdaosCibe(){
		Student s=new Student(12,"Ion","Dana","2901019990089",2500,"distanta","cibe");
		
		float adaos = (float) (s.getTaxa() * 0.2);
		assertEquals(adaos,s.adaosTaxa(),0);
	}
	
	@Test
	public void testAdaosAltcveva(){
		Student s=new Student(12,"Ion","Dana","2901019990089",2500,"distanta","statistica");
		
		float adaos = (float) (s.getTaxa() * 0.05);
		assertEquals(adaos,s.adaosTaxa(),0);
	}
}
