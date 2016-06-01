package testeFacultate;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ro.ase.proiect_cts.Facultate;
import ro.ase.proiect_cts.Student;


public class testGetLista {

	@Test
	public void testareGetLista(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		listaS.add(new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info"));
		listaS.add(new Student(102,"Moise","Ioana","2958467389432",1900,"zi","cibe"));
		Facultate f= new Facultate(listaS);
		assertEquals(listaS,f.getStudentList());
	}
	
	@Test
	public void testFirmaNull() {
		ArrayList<Student> listaS = null;
		Facultate f= new Facultate(listaS);
		try {

			
			System.out.println(f.getStudentList());
			fail("trebuia o exceptie");

		} catch (NullPointerException ex) {
			System.out.println("  ");
		}
		

	}

}
