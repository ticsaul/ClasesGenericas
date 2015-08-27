// Programa para probar la Clase genérica Pila

public class PruebaPila
{
	private double[] elementosDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
	private int[] elementosInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

	private Pila< Double > pilaDouble; // pila que almacena objetos Double
	private Pila< Integer > pilaInteger; // pila que almacena objetos Integer

	// prueba objetos Pila
	public void pruebaPilas()
	{
		pilaDouble = new Pila< Double>(5); // Pila de objetos Double
		pilaInteger = new Pila< Integer >(10); // Pila de objetos Integer

		pruebaPushDouble(); // mete valor double en pilaDouble
		pruebaPopDouble(); // saca de pilaDouble
		pruebaPushInteger(); // mete valor int en pilaInteger
		pruebaPopInteger(); // saca de pilaInteger
	}

	// *******************************************************************
	// probar el método push de la Pila con valores double
	public void pruebaPushDouble()
	{
		// mete elementos en la pila
		try
		{
			System.out.println("\n Metiendo elementos en pilaDouble");

			// mete elementos
			for (double elemento : elementosDouble) 
			{
				System.out.printf("%.1f ", elemento);
				pilaDouble.push(elemento); // mete en pila
			}		
		}
		catch (ExcepcionPilaLlena excepcionPilaLlena)
		{
			System.err.println();
			excepcionPilaLlena.printStackTrace();
		}
	}

	// probar el método pop de la Pila con valores double
	public void pruebaPopDouble()
	{
		// saca elementos de la Pila
		try
		{
			System.out.println("\nSacando elementos de pilaDouble");
			double valorASacar; // almacena el elemento que se eliminó de la pila

			// elimina todos los elementos de la Pila
			while (true)
			{
				valorASacar = pilaDouble.pop(); // saca de pilaDouble
				System.out.printf("%.1f ", valorASacar);
			}
		}
		catch(ExcepcionPilaVacia excepcionPilaVacia)
		{
			System.err.println();
			excepcionPilaVacia.printStackTrace();
		}
	}
	// *******************************************************************


	// *******************************************************************
	// probar el método push de la Pila con valores int
	public void pruebaPushInteger()
	{
		// mete elementos en la pila
		try
		{
			System.out.println("\n Metiendo elementos en pilaInteger");

			// mete elementos
			for (int elemento : elementosInteger) 
			{
				System.out.printf("%d ", elemento);
				pilaInteger.push(elemento); // mete en pila
			}		
		}
		catch (ExcepcionPilaLlena excepcionPilaLlena)
		{
			System.err.println();
			excepcionPilaLlena.printStackTrace();
		}
	}

	// probar el método pop de la Pila con valores int
	public void pruebaPopInteger()
	{
		// saca elementos de la Pila
		try
		{
			System.out.println("\nSacando elementos de pilaInteger");
			int valorASacar; // almacena el elemento que se eliminó de la pila

			// elimina todos los elementos de la Pila
			while (true)
			{
				valorASacar = pilaInteger.pop(); // saca de pilaDouble
				System.out.printf("%d ", valorASacar);
			}
		}
		catch(ExcepcionPilaVacia excepcionPilaVacia)
		{
			System.err.println();
			excepcionPilaVacia.printStackTrace();
		}
	}
	// *******************************************************************

	public static void main(String[] args) 
	{
		PruebaPila objeto = new PruebaPila();
		objeto.pruebaPilas();
	}

}