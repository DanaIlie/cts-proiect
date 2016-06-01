package testeFacultate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import ro.ase.proiect_cts.Facultate;
import ro.ase.proiect_cts.Student;


public class testCeaMaiMareTaxa {

	@Test
	public void testCelMaiBinePlatit() {
		ArrayList<Student> listaS = new ArrayList<Student>();
		Student s1=new Student(12,"Ion","Dana","2901019990089",2500,"distanta","info");
		Student s2=new Student(102,"Moise","Ioana","2958467389432",1900,"zi","cibe");
		listaS.add(s1);
		listaS.add(s2);
		
		Facultate f= new Facultate(listaS);
		assertEquals(s1,f.ceaMaiMareTaxa());
	}
	
	@Test
	public void testCeaMaiMareTaxaListaNula(){
		ArrayList<Student> listaS=null;
		try{
			Facultate f=new Facultate(listaS);
			System.out.println(f.ceaMaiMareTaxa());
			fail("lista e nula");
		}catch(NullPointerException ex){}
		
	}
	
	@Test
	public void testCeaMaiMareTaxaListaGoala(){
		ArrayList<Student> listaS = new ArrayList<Student>();
		try{
			Facultate f=new Facultate(listaS);
			System.out.println(f.ceaMaiMareTaxa());
			fail("lista e goala");
		}catch(EmptyStackException ex){}
	}

}
