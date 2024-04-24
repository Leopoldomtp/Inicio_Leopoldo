package Foreach;

public class BucleForEach {

	public static void main(String[] args) {
		//El bucle for-each es una forma simplificada de iterar sobre elementos de 
		//una colección o un array. Lo utilizamos cuando queremos recorrer todos los 
		//elementos de una estructura de datos sin preocuparnos por los índices 
		//o la manipulación directa de un contador. Ejemplo
		
		String[] nombres = {"Juan", "María", "Carlos"};

		for (String nombre : nombres) {
		    System.out.println(nombre);
		}
		//otro ejemplo
		int[] numeros = {1, 2, 3, 4, 5};

		for (int numero : numeros) {
		    System.out.println(numero);
		}
		
		System.out.println("Jano ha estado aqui :)");
		
	}
}
