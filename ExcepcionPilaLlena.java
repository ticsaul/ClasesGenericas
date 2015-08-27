
// se crea la excepcion
public class ExcepcionPilaLlena extends RuntimeException
{
	// constructor sin argumentos
	public ExcepcionPilaLlena()
	{
		this("La Pila esta llena");
	}

	// constructor con argumento
	public ExcepcionPilaLlena(String excepcion)
	{
		super(excepcion);
	}
	
}