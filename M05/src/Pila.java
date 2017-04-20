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
	 * M�tode que retorna si la pila cont� elements o no.
	 * 
	 * @return true, si la pila est� buida; i false, si la pila cont� algun element
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
	 * M�tode que perment afegir un nou element a la pila. A part d'afegir l'element
	 * augmenta la mida de la pila en una unitat.
	 * 
	 * @param o Integer que es vol afegir a la pila
	 */
	public void apilar(Integer o) {
		pila.add(o);
		mida++;
	}
	/**
	 * M�tode que retorna l'�ltim element afegit i l'elimina de la pila.
	 *  
	 * @return L'�ltim element de la pila. Si la pila est� buida, retorna null.
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
	 * M�tode que ens indica el nombre d'elements que hi ha a la pila
	 * 
	 * @return nombre d'elements de la pila
	 */
	public int getNumElements() {
		return mida;
	}
}