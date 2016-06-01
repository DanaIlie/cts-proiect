package testeFacultate;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.proiect_cts.Facultate;
import ro.ase.proiect_cts.Student;


public class testAddStudent {

	
			@Test
			public void testAddStudentInexistent() {
				Facultate f=Facultate.getInstance();
				Student s= new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
				f.addStudent(s);
				assertEquals(s,f.getStudent(s));
				
			}
			
			
			@Test
			public void testAdaugareStudentNull(){
				Facultate f=Facultate.getInstance();
				Student s=null;
				try{
					f.addStudent(s);
				}
				catch(NullPointerException ex){
					
				}
			}

}
