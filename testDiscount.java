package testeStudent;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.proiect_cts.Student;

public class testDiscount {

	@Test
	public void testDiscountDistanta() {
		Student s=new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		float dis=(float) (0.7*2500);
		assertEquals(dis,s.discountTaxa(),0);
	}
	
	@Test
	public void testDiscountAltceva(){
		Student s=new Student(12,"Ion","Dana","2901019990089",2500,"zi","info");
		float dis=(float) (1*2500);
		assertEquals(dis,s.discountTaxa(),0);
	}
	
	@Test
	public void testDiscountGeneral(){
		Student s=new Student(12,"Ion","Dana","2901019990089",2500,"frecventa","info");
		float dis=0;
		if (s.getFormaInvatamant().equalsIgnoreCase("distanta")) {

			dis = (float) (s.getTaxa()* 0.7);
		} else {
			dis = (float) (s.getTaxa());
		}
		
		assertEquals(dis,s.discountTaxa(),0);
	}

}
