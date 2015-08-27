
// se crea la excepcion
public class ExcepcionPilaVacia extends RuntimeException
{
	// constructor sin argumentos
	public ExcepcionPilaVacia()
	{
		this("La Pila esta Vacia");
	}

	// constructor con argumento
	public ExcepcionPilaVacia(String excepcion)
	{
		super(excepcion);
	}
	
}