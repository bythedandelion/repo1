import org.junit.Before;
import org.junit.Test;

public class PilaBuidaTest {
	private Pila pila;
	@Before
	public void setUp() throws Exception {
		pila = new Pila();
	}

	@Test
	public void testPilaBuida() {
		System.out.println("Buit? : " + pila.pilaBuida());
	}

	@Test
	public void testApilar() {
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
