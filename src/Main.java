import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author María Mercedes Retolaza Reyna, 16339  
 * @author Gadhi Rodriguez, 16206
 * @author Javier Ramos, 16230
 * @author Diego Fernandez, 16344
 */
public class Main {
	
	/**
	 * @param args
	 * @throws IOException
	 * recibe el archivo de texto y lo muestra en la consola 
	 */
	public static void main(String[] args) throws IOException{
		
		long startTime = System.currentTimeMillis();

		String cadena;
		Lista numeros;
		
		numeros = new Lista();
		int n = 0;
		int min = 0;

		//Se lee el archivo numeros.txt
		FileReader lecT = new FileReader(System.getProperty("user.dir") + "/numeros.txt");
		BufferedReader buff = new BufferedReader(lecT);
		
		while((cadena = buff.readLine())!=null) {
    		numeros.AgregarNodo(cadena);
		}
		
		//Impresion con quickSort
		numeros.quickSort();
		System.out.println(numeros.toString());
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

        
	}
}
