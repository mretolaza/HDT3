import java.util.HashSet;
import java.util.Set;
import java.lang.Object;
/**
 *
 * @author María Mercedes Retolaza Reyna, 16339  
 * @author Gadhi Rodriguez, 16206
 * @author Javier Ramos, 16230
 * @author Diego Fernandez, 16344
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
    
    /**
     * El sort de burbuja recibe la cantidad de n valores y los ordena mediante un método llamado 
     * swap. Se recibe la cabeza como primer valor de referencia y luego se apunta el siguiente para 
     * así intercambiar el de menor valor entre esos dos que compara. Llama al método Swapp que se encarga 
     * de tomar los valores que tienen (sin cambiar los nodos de referencia) y así ordenar los n valores. 
     */
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
    }
    
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
    
    /** Este método recibe dos parametros, el "actual" y el "Siguiente" este se encarga de recibir los valores 
     * sin cambiar la referencia y así ordenarlos hadta terminar la lista. Internamente tiene una variable temporal 
     * que se encarga de guardar el siguiente valor para así no perder ningun dato mediante se realiza el cambio 
     * @param actual
     * @param siguiente
     */
    public void Swapp(Nodo actual, Nodo siguiente){
    	Comparable Temporal = actual.getValor(); 
    	actual.setValor(siguiente.getValor());
    	siguiente.setValor(Temporal);
    }
    
    
}
