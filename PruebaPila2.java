// Programa para probar métodos genéricas usando la Clase genérica Pila

public class PruebaPila2
{
	private Double[] elementosDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
	private Integer[] elementosInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

	private Pila< Double > pilaDouble; // pila que almacena objetos Double
	private Pila< Integer > pilaInteger; // pila que almacena objetos Integer

	// prueba objetos Pila
	public void pruebaPilas()
	{
		pilaDouble = new Pila< Double>(5); // Pila de objetos Double
		pilaInteger = new Pila< Integer >(10); // Pila de objetos Integer

		probarPush("pilaDouble", pilaDouble, elementosDouble); 
		probarPop("pilaDouble", pilaDouble); 
		probarPush("pilaInteger", pilaInteger, elementosInteger); 
		probarPop("pilaInteger", pilaInteger); 
	}

	//*******************************************************************************
	// método genérico probarPush mete elementos en una Pila
	public < T > void probarPush(String nombre, Pila< T > pila, T[] elementos)
	{
		// mete elementos a la pila
		try
		{
			System.out.printf("\nMetiendo elementos a %s\n", nombre);

			// mete elementos
			for (T elemento : elementos) 
			{
				System.out.printf("%s ", elemento);
				pila.push(elemento); // mete elemento a la pila
			}
			
		}
		catch (ExcepcionPilaLlena excepcionPilaLlena)
		{
			System.out.println();
			excepcionPilaLlena.printStackTrace();
		}
	}

	// el método genérico probarPop saca elementos de una Pila
	public < T > void probarPop(String nombre, Pila< T > pila)
	{
		// saca elementos de la pila
		try
		{
			System.out.printf("\nSacando elementos de %s\n", nombre);
			T valorASacar; // almacena el elemento eliminado de la pila

			// elimina todos los elementos de la Pila
			while(true)
			{
				valorASacar = pila.pop(); // saca de la pila
				System.out.printf("%s ", valorASacar);
			}
		}
		catch (ExcepcionPilaVacia excepcionPilaVacia)
		{
			System.out.println();
			excepcionPilaVacia.printStackTrace();
		}
	}
	//*******************************************************************************

	public static void main(String[] args) 
	{
		PruebaPila2 objeto = new PruebaPila2();
		objeto.pruebaPilas();
	}
}