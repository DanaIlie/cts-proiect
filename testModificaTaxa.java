package testeFacultate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import ro.ase.proiect_cts.Facultate;
import ro.ase.proiect_cts.Student;


public class testModificaTaxa {

	@Test
	public void testModificareTaxaStud(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		Student s= new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		listaS.add(s);
		Facultate f=new Facultate(listaS);
		f.modificaTaxa(s, 2000);
		assertEquals(2000,f.getStudent(s).getTaxa());
	}
	
	
	@Test
	public void testModificaTaxaStudentNull(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		Student s1= null;
		Student s2=new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		listaS.add(s1);
		listaS.add(s2);
		try{
			Facultate f=new Facultate(listaS);
			f.modificaTaxa(s1, 2000);
			fail("angajatul e null");
			
		}
		catch(NullPointerException ex){
			
		}
		
	}
	
	@Test
	public void testModificaListaNula(){
		ArrayList<Student> listaS=null;
		Student s2=new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		try{
			Facultate f=new Facultate(listaS);
			f.modificaTaxa(s2, 2000);
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void testModificareListaGoala(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		Student s2=new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		try{
			Facultate f=new Facultate(listaS);
			f.modificaTaxa(s2, 3000);
		}
		catch(EmptyStackException ex){}
		
		
	}

}
