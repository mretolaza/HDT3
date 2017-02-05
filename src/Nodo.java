

public class Nodo <T extends Comparable> implements Comparable{
    protected T  Valor; 
    protected Nodo Siguiente; 
    
    public Nodo(T valor)
    {
        this.Valor = valor;
    }
    
    public void setValor(T valor)
    {
        this.Valor = valor;
    }
    
    public T getValor()
    {
        return this.Valor;
    } 
    
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    public Nodo getSiguiente()
    {
        return this.Siguiente;
    }
    
    @Override
    public String toString()
    {
        return Valor.toString();
    }

    @Override
    public int compareTo(Object other) {
        return Valor.compareTo(((Nodo) other).getValor()); 
    }
    
    
            
}
