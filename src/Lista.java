import java.util.HashSet;
import java.util.Set;
import java.lang.Object;
/**
 *
 * @author MaríaMercedesRetolazaReyna 
 */
public class Lista <U extends Comparable> implements Comparable{
    
    protected Nodo<U> Cabeza; 
    int count; 
    
    public void AgregarNodoCabeza(U valor)
    {
        Nodo<U> NuevoNodo = new<U> Nodo(valor);
        NuevoNodo.setSiguiente(Cabeza);
        Cabeza = NuevoNodo;        
    }
    public void AgregarNodo(U valor)
    {
        Nodo Cola = ObtenerUltimo();
        //si no existe ningun nodo, crea la cabeza, de lo contrario agrega el nuevo Nodo al siguiente de la cola
        if ( Cola== null)
            Cabeza = new Nodo (valor);
        else                    
            Cola.setSiguiente(new Nodo(valor));
        
        count++;
    }
    public Nodo ObtenerCabeza()
    {
        return Cabeza;
    }
    public Nodo ObtenerUltimo()
    {
        Nodo NodoActual = Cabeza;
        if (NodoActual == null)
            return null;
        while (NodoActual.getSiguiente() !=  null)
        {
            NodoActual = NodoActual.getSiguiente();
        }
        return NodoActual;
        
    }
    
    public Nodo EliminarNodo()
    {
        Nodo NodoADevolver = Cabeza; 
        Cabeza = Cabeza.getSiguiente();
        count--; 
        return NodoADevolver;
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        if (Cabeza != null)
        {
            Nodo NodoActual = Cabeza;
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

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Bubble Sort con nodos 
    
    public void BubbleSort()
     
    {
    	int i=0;	
    	while (i<count){
    		
    		Nodo NodoActual= Cabeza; 
    		Nodo NodoSiguiente = NodoActual.getSiguiente(); 
    		
    		while (NodoSiguiente != null){
    			if (NodoActual.compareTo(NodoSiguiente)>0)
    				Swapp(NodoActual,NodoSiguiente);
    			NodoActual =NodoSiguiente; 
    			NodoSiguiente=NodoSiguiente.getSiguiente(); 		
    		}	
    	}
    	
    }//
    
    public void SelectionSort(){
    	int i=0;
    	Nodo NodoActual= Cabeza;
    	Nodo min = null;  
    	
    	while (i<count){
    		 Nodo NodotempActual= NodoActual; 
    		 Nodo NodoSiguiente = NodoActual.getSiguiente(); 
    		 Nodo NodoMin= NodoActual; 
    		 min.setValor( NodotempActual.getValor()); 
    		 
    		 while (NodoSiguiente != null){
    			 if (NodotempActual.compareTo(NodoSiguiente)>0){
    				 NodoMin= NodoSiguiente; 
    			 NodotempActual = NodoSiguiente; 
    			 NodoSiguiente = NodoSiguiente.getSiguiente(); 
    			 }
    			 Swapp(NodotempActual,NodoMin);
    			 i++; 
    			 NodoActual = NodoActual.getSiguiente(); 	 
    		 }
    	}
    	
    }
    
    public void Swapp(Nodo actual, Nodo siguiente){
    	Comparable Temporal = actual.getValor(); 
    	actual.setValor(siguiente.getValor());
    	siguiente.setValor(Temporal);
    }
    
    
}
