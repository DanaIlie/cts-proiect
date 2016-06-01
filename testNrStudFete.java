package testeFacultate;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ro.ase.proiect_cts.Facultate;
import ro.ase.proiect_cts.Student;


public class testNrStudFete {

	@Test
	public void testareNrFete() {
		ArrayList<Student> listaS = new ArrayList<Student>();
		listaS.add(new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info"));
		listaS.add(new Student(102,"Moise","Ioana","2958467389432",1900,"zi","cibe"));
		Facultate f= new Facultate(listaS);
		assertEquals(2,f.nrFete());
		
	}
	
	@Test
	public void testareNrFemeiListaNull(){
		ArrayList<Student> listaS=null;
		try{
			Facultate f=new Facultate(listaS);
			System.out.println(f.nrFete());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}

	@Test
	public void testareNrFemeiListaGoala(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		Facultate f= new Facultate(listaS);
		assertEquals(0,f.nrFete());
	}

}
