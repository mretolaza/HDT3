/**
 *
 * @author María Mercedes Retolaza Reyna, 16339  
 * @author Gadhi Rodriguez, 16206
 * @author Javier Ramos, 16230
 * @author Diego Fernandez, 16344
 */

public class Sorting<K extends Comparable<K>>
{

	/**
	* Metodo que realiza un selection sort
	*/
   public void selectionSort (ListaDoble<K> list)
   {
	   NodoDoble<K> nodoActual = list.ObtenerCabeza();
	  
	   nodoActual = list.ObtenerCabeza();
	   NodoDoble<K> menor = nodoActual;
	   
	   for(int i = 0; i < list.Length(); i++){
		   NodoDoble<K> nodoComparar = nodoActual;
		   menor = nodoActual;
		   for(int j = i; j < list.Length(); j++){
			   if(nodoComparar.getSiguiente() != null){
				   if(nodoActual.compareTo(nodoComparar.getSiguiente().getValor()) > 0 && menor.compareTo(nodoComparar.getSiguiente().getValor()) > 0){
					   menor = nodoComparar.getSiguiente();
				   }
				   nodoComparar = nodoComparar.getSiguiente();
			   }  
			   
			   System.out.println(list);
		   }
		   K valorActual = nodoActual.getValor();
		   nodoActual.setValor(menor.getValor());
		   menor.setValor(valorActual);
		   
		   nodoActual = nodoActual.getSiguiente();
		   
	   }
   }
   /**
   * Metodo que realiza un insertion sort
   */
   public void insertionSort (ListaDoble<K> lista)
   {
	   NodoDoble<K> NodoActual = lista.ObtenerCabeza();
	   NodoDoble<K> NodoComparar = NodoActual;
	   while(NodoActual != null){
		   while (NodoComparar.getAnterior() != null && NodoComparar.compareTo(NodoComparar.getAnterior().Valor) < 0){
			   K Vmen = (K) NodoComparar.Valor;
			   K Vmay = (K) NodoComparar.getAnterior().Valor;
			   NodoComparar.setValor(Vmay);
			   NodoComparar.getAnterior().setValor(Vmen);
			   NodoComparar = NodoComparar.getAnterior();
		   }
		   NodoActual = NodoActual.getSiguiente();
		   NodoComparar = NodoActual;
	   }
   }
   
   /**
   * Metodo para realizar un Merge sort con una lista dinamica
   */
   public void dynamikMerge(ListaDoble<K> lista){
	   
	   Comparable[] data = new Comparable[lista.Length()];
	   
	   NodoDoble<K> nodoActual = lista.ObtenerCabeza();
	   for(int i = 0; i < lista.Length(); i++){
		   data[i] = nodoActual.getValor();
		   nodoActual = nodoActual.getSiguiente();
	   }
	   
	   int min = lista.Indice(lista.ObtenerCabeza());
	   int max = lista.Indice(lista.ObtenerUltimo());
	   
	   mergeSort(data, min, max);
	   
	   nodoActual = lista.ObtenerCabeza();
	   for(int i = 0; i < lista.Length(); i++){
		   nodoActual.setValor((K)data[i]);
		   nodoActual = nodoActual.getSiguiente();
	   }
	   
   }
   /**
   * Metodo que realiza un sort en una lista estatica
   */
   public void mergeSort(Comparable[] data, int min, int max){
	   
	   if (min < max)
	      {
	         int mid = (min + max) / 2;
	         mergeSort (data, min, mid);
	         mergeSort (data, mid+1, max);
	         merge (data, min, mid, max);
	      }

	   
   }
   /**
   * Metodo que une las fracciones de una lista para realizar el Merge Sort
   */
   public void merge(Comparable[] data, int first, int mid, int last){
	   
	   Comparable[] temp = new Comparable[data.length];

	      int first1 = first;
	      int last1 = mid;
	      int first2 = mid+1;
	      int last2 = last;
	      int index = first1;

	   
	   while (first1 <= last1 && first2 <= last2)
	      {
	         if (data[first1].compareTo(data[first2]) < 0)
	         {
	            temp[index] = data[first1];
	            first1++;
	          }
	          else
	          {
	             temp[index] = data[first2];
	             first2++;
	          }
	          index++;
	      }

	   
	   while (first1 <= last1)
	      {
	         temp[index] = data[first1];
	         first1++;
	         index++;
	      }

	   
	   while (first2 <= last2)
	      {
	         temp[index] = data[first2];
	         first2++;
	         index++;
	      }
	   
	   for(index = first; index <= last; index++){
		   data[index] = temp[index];
	   }
	   
   }
   
   
   

}
