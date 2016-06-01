package testeFacultate;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.proiect_cts.Facultate;
import ro.ase.proiect_cts.Student;


public class testCitireFisier {

	FileReader reader;
	BufferedReader bf;
	
	@Before
	public void setUp() throws Exception {
		reader = new FileReader("studentTest.txt");
		bf = new BufferedReader(reader);
	}

	@Test
	public void testCitire() {
		Facultate f=Facultate.getInstance();
		Student s1= new Student(102,"Moise","Ioana","2958467389432",1900,"zi","cibe");
		try{
			 reader=new FileReader("studentTest.txt");
			 bf=new BufferedReader(reader);
			String linie=null;
			while((linie=bf.readLine())!=null && (linie.length())!=0){
				linie=bf.readLine();
				 String[] elements = linie.split(",");
	                if(elements.length!=7){
	                    throw new Exception("Linie invalida!");
	                }
	                Student s = new Student();
	                s.setNrMatricol(Integer.parseInt(elements[0].trim()));
	                s.setNume(elements[1]);
	                s.setPrenume(elements[2]);
	                s.setCnp(elements[3]);
	                s.setTaxa(Integer.parseInt(elements[4].trim()));
	                s.setFormaInvatamant(elements[5]);
	                s.setSpecializare(elements[6]);
	                
	                linie = bf.readLine();
	                f.getStudentList().add(s);            
			}
			
			assertEquals(s1,f.getStudent(s1));
			
		}
		catch(FileNotFoundException ex){}
		catch(Exception ex){}
		}

	@After
	public void tearDown() throws Exception {
		reader.close();
		bf.close();
	}

}
