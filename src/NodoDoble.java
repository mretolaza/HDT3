/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author OscarIvan
 */
public class NodoDoble <T extends Comparable<T>> implements Comparable<T> {
    protected T Valor; 
    protected NodoDoble<T> Siguiente; 
    protected NodoDoble<T> Anterior;

    public NodoDoble(T valor) {
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
    
    
    public void setSiguiente(NodoDoble<T> siguiente)
    {
        this.Siguiente = siguiente;
        siguiente.setAnterior(this);        
    }
    
    
    public NodoDoble<T> getSiguiente()
    {
        return this.Siguiente;
    }
    
    public void setAnterior(NodoDoble<T> anterior)
    {
        this.Anterior = anterior;
    }
    
    public NodoDoble<T> getAnterior()
    {
        return this.Anterior;
    }

	@Override
	public int compareTo(T o) {
		return Valor.compareTo(o);
	}
    
}
