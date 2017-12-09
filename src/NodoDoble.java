/**
 *
 * @author María Mercedes Retolaza Reyna, 16339  
 * @author Gadhi Rodriguez, 16206
 * @author Javier Ramos, 16230
 * @author Diego Fernandez, 16344
 */

public class NodoDoble <T extends Comparable<T>> implements Comparable<T> {
    protected T Valor; 
    protected NodoDoble<T> Siguiente; 
    protected NodoDoble<T> Anterior;

    public NodoDoble(T valor) {
        this.Valor = valor;
    }
    /*
    Metodo que cambia el valor del Atributo Valor
    */
    public void setValor(T valor)
    {
        this.Valor = valor;
    }
    /*
    Metodo que devuelve el valor del Atributo Valor
    */
    public T getValor()
    {
        return this.Valor;
    } 
    
    /*
    Metodo que cambia el puntero al siguiete Nodo
    */
    public void setSiguiente(NodoDoble<T> siguiente)
    {
        this.Siguiente = siguiente;
        siguiente.setAnterior(this);        
    }
    
    /*
    Metodo que devuelve el Nodo que se encuentra en el puntero
    */
    public NodoDoble<T> getSiguiente()
    {
        return this.Siguiente;
    }
    /*
    Metodo que cambia el puntero al Nodo anterior
    */
    public void setAnterior(NodoDoble<T> anterior)
    {
        this.Anterior = anterior;
    }
    /*
    Devuelve el Nodo Anterior
    */
    public NodoDoble<T> getAnterior()
    {
        return this.Anterior;
    }

	@Override
	public int compareTo(T o) {
		return Valor.compareTo(o);
	}
    
}
