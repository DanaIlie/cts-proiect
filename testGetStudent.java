package testeFacultate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import ro.ase.proiect_cts.Facultate;
import ro.ase.proiect_cts.Student;


public class testGetStudent {

	@Test
	public void testGetStudentNotNull(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		listaS.add(new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info"));
		Student s= new Student(15,"Ionica","Marian","1901019990089",1800,"zi","info");
		listaS.add(s);
		Facultate f= new Facultate(listaS);
		assertEquals(s,f.getStudent(s));
		
	}
	
	@Test
	public void testStudentInexistent(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		listaS.add(new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info"));
		Student s= new Student(15,"Ionica","Marian","1901019990089",1800,"zi","info");
		Facultate f= new Facultate(listaS);
		assertNull(f.getStudent(s));
	}
	
	@Test
	public void getStudentDinListaNula(){
		ArrayList<Student> listaS=null;
		try{
			Facultate f=new Facultate(listaS);
			f.getStudent(new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info"));
			fail("lista e nulla");
		}
		catch(NullPointerException ex){
			
		}
	}
	
	@Test
	public void getStudentDinListaGoala(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		try{
			Facultate f=new Facultate(listaS);
			f.getStudent(new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info"));
			fail("lista goala");
		}
		catch(EmptyStackException ex){}
		}
	
	@Test
	public void getStudentNull(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		Student s1= new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		Student s2=null;
		listaS.add(s1);
		listaS.add(s2);
		try{
			Facultate f=new Facultate(listaS);
			f.getStudent(s2);
		}
		catch(NullPointerException ex){}
		
	}

}
