/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author OscarIvan
 */
public class ListaDoble <V extends Comparable<V>>
{
    protected NodoDoble<V> Cabeza;

    
    public void AgregarNodoCabeza(V valor)
    {
        NodoDoble<V> NuevoNodo = new NodoDoble<V>( valor);
        NuevoNodo.setSiguiente(Cabeza);
        Cabeza.setAnterior(NuevoNodo);
        Cabeza = NuevoNodo;        
    }
    
    public int Length(){
    	int leng = 0;
    	NodoDoble<V> nodoActual = Cabeza;
    	
    	while (nodoActual != null){
    		leng++;
    		nodoActual = nodoActual.getSiguiente();
    	}
    	
    	return leng;
    }
    
    public NodoDoble<V> ObtenerNodoMedio(ListaDoble<V> lista, NodoDoble<V> min, NodoDoble<V> max){
    	NodoDoble<V> nodoDevolver = min;
    	for(int i = lista.Indice(min); i < lista.Indice(max)/2; i++){
    		nodoDevolver = nodoDevolver.getSiguiente();
    	}
    	
    	return nodoDevolver;
    	
    }
    
    public int Indice(NodoDoble<V> nodo){
    	int contador = 0;
    	NodoDoble<V> nodoIgual = Cabeza;
    	while(!nodoIgual.equals(nodo) && nodoIgual!= null){
    		contador++;
    		nodoIgual = nodoIgual.getSiguiente();
    	}
    	return contador;
    }
    
    
    public void AgregarNodo(V valor)
    {
        NodoDoble<V> Cola = ObtenerUltimo();
        //si no existe ningun nodo, crea la cabeza, de lo contrario agrega el nuevo Nodo al siguiente de la cola
        if ( Cola== null)
            Cabeza = new NodoDoble<V> (valor);
        else
        {             
            Cola.setSiguiente(new NodoDoble<V>(valor));                                            
            Cola.getSiguiente().setAnterior(Cola);            
        }
        
    }
    
    
    public NodoDoble<V> EliminarNodo()
    {
        NodoDoble<V> NodoADevolver = Cabeza; 
        Cabeza = Cabeza.getSiguiente();
        if (Cabeza != null)
            Cabeza.setAnterior(null);
        return NodoADevolver;
    
    }
    
    public NodoDoble<V> ObtenerCabeza()
    {
        return Cabeza;
    }
    
    public NodoDoble<V> ObtenerUltimo()
    {
        NodoDoble<V> NodoActual = Cabeza;
        if (NodoActual == null)
            return null;
        while (NodoActual.getSiguiente() !=  null)
        {
            NodoActual = (NodoDoble<V>) NodoActual.getSiguiente();
            
        }
        return NodoActual;        
    }
    
        public String toString()
    {
        StringBuilder sb = new StringBuilder();
        if (Cabeza != null)
        {
            NodoDoble<V> NodoActual = Cabeza;
            while (NodoActual!= null)
            {
                sb.append(NodoActual.getValor());
                sb.append ("->");
                NodoActual = NodoActual.getSiguiente();
            }            
        }
        sb.append("null");
        return sb.toString();
    }
}
