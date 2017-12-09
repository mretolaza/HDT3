
/**
 * @author María Mercedes Retolaza Reyna, 16339  
 * @author Gadhi Rodriguez, 16206
 * @author Javier Ramos, 16230
 * @author Diego Fernandez, 16344
 */
/**Clase nodo 
 *
 * @param <T>
 */
public class Nodo <T extends Comparable> implements Comparable{
    protected T  Valor; 
    protected Nodo Siguiente; 
    
    /**
     * @param valor
     */
    public Nodo(T valor)
    {
        this.Valor = valor;
    }
    
    /**Procedimiento que recibe el valor que el usuario ingrese  
     * @param valor
     */
    public void setValor(T valor)
    {
        this.Valor = valor;
    }
    
    /**Funcion que devuelve el valor que el usuario ingrese 
     * @return
     */
    public T getValor()
    {
        return this.Valor;
    } 
    
    /** Procedimiento Que recibe el siguiente valor del puntero 
     * @param siguiente
     */
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    /**Funcion que brinda el valor del siguiente puntero 
     * @return
     */
    public Nodo getSiguiente()
    {
        return this.Siguiente;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return Valor.toString();
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Object other) {
        return Valor.compareTo(((Nodo) other).getValor()); 
    }
    
    
            
}
