package testeFacultate;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testAddStudent.class, testCaseSingleton.class,
		testCeaMaiMareTaxa.class, testCitireFisier.class,
		testEliminaStudent.class, testGetLista.class, testGetStudent.class,
		testModificaTaxa.class, testNrStudBaieti.class, testNrStudFete.class })
public class AllTestsFacultate {

}
