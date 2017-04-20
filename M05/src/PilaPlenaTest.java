import org.junit.Before;
import org.junit.Test;

public class PilaPlenaTest {
	
	private Pila pila;
	
	@Before
	public void setUp() throws Exception {
		pila = new Pila();
		pila.apilar(5);
	}

	@Test
	public void testPilaBuida() {
		System.out.println("Buit? : " + pila.pilaBuida());
	}

	@Test
	public void testApilar() {
		pila.apilar(6);
	}

	@Test
	public void testDesapilar() {
		pila.desapilar();
	}

	@Test
	public void testGetNumElements() {
		System.out.println(pila.getNumElements());
	}

}
