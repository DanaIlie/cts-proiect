package testeFacultate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import ro.ase.proiect_cts.Facultate;
import ro.ase.proiect_cts.Student;


public class testEliminaStudent {

	@Test
	public void eliminaStudentExistent(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		Student s= new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		listaS.add(s);
		listaS.add(new Student(13,"Iona","Oana","2901019990089",2500,"zi","info"));
		Facultate f=new Facultate(listaS);
		int i= f.getStudentList().size();
		int rez=i-1;
		f.eliminaStudent(s);;
		int rez2=f.getStudentList().size();
		assertEquals(rez,rez2);
		
	}
	
	
	
	@Test
	public void eliminaStudentListaNula(){
		ArrayList<Student> listaS=null;
		try{
			Facultate f=new Facultate(listaS);
			Student s= new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
			f.eliminaStudent(s);
			fail("lista e nula");
		}
		catch(NullPointerException ex){
			
		}
	}
	
	@Test
	public void eliminaStudentNull(){
		ArrayList<Student> listaS=new ArrayList<Student>();
		Student s=null;
		listaS.add(s);
		try{
			Facultate f=new Facultate(listaS);
			f.eliminaStudent(s);
			fail("angajatul e null");
		}
		catch(NullPointerException ex){}
	}
	
	
	@Test
	public void eliminaAngajatListaGoala(){
		ArrayList<Student> listaS=new ArrayList<Student>();
		try{
			Facultate f=new Facultate(listaS);
			Student s= new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		    f.eliminaStudent(s);;
			fail("lista goala");
			
		}
		catch(EmptyStackException ex){}
			
	}

}
