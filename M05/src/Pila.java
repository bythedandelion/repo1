import java.util.Vector;

public class Pila {

	private int mida;
	private Vector<Integer> pila;

	/**
	 * Construtor Pila
	 */
	public Pila() {
		pila = new Vector<Integer>();
		mida = 0;
	}
	/**
	 * Mètode que retorna si la pila conté elements o no.
	 * 
	 * @return true, si la pila està buida; i false, si la pila conté algun element
	 */
	public boolean pilaBuida() {
		if(mida == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Mètode que perment afegir un nou element a la pila. A part d'afegir l'element
	 * augmenta la mida de la pila en una unitat.
	 * 
	 * @param o Integer que es vol afegir a la pila
	 */
	public void apilar(Integer o) {
		pila.add(o);
		mida++;
	}
	/**
	 * Mètode que retorna l'últim element afegit i l'elimina de la pila.
	 *  
	 * @return L'últim element de la pila. Si la pila està buida, retorna null.
	 */
	public Integer desapilar() {
		if (mida == 0)
		{
			return null;
		}
		else
		{
			int ultim = pila.lastElement();
			pila.remove(pila.lastElement());
			mida--;
			return ultim;
		}
	}
	/**
	 * Mètode que ens indica el nombre d'elements que hi ha a la pila
	 * 
	 * @return nombre d'elements de la pila
	 */
	public int getNumElements() {
		return mida;
	}
}