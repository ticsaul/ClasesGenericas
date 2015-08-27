// La clase genérica Pila

public class Pila< E >
{
	private final int tamanio; // número de elementos en la pila
	private int superior; // ubicación del elemento superior
	private E[] elementos; // arreglo que almacena los elementos de la pila

	// el constructor sin argumentos crea una pila del tamaño predeterminado
	public Pila()
	{
		this(10); // tamaño predeterminado de la pila
	}

	// constructor que crea una pila del número especificado de elementos
	public Pila(int s)
	{
		tamanio = s > 0 ? s : 10; // establece el tamaño de la Pila (Operador ternario)
		superior = -1; // al principio, la Pila está vacía

		elementos = (E[]) new Object[tamanio]; // se crea arreglo
	}

	// mete un elemento a la pila
	public void push(E valorAMeter)
	{
		if (superior == tamanio-1) // si la pila está llena
			throw new ExcepcionPilaLlena(
				String.format("La Pila esta llena, no se puede meter %s", valorAMeter)
				);

		elementos[++superior] = valorAMeter; // coloca valorAMeter en la Pila
	}

	// devuelve el elemento superior si no está vacía
	public E pop()
	{
		if (superior == -1) // si la pila está vacía
			throw new ExcepcionPilaVacia("La Pila esta vacía, no se puede sacar");

		return elementos[superior--]; // elimina y devuelve elemento superior de la Pila
	}
	
}