package SAB.Exception;

@SuppressWarnings("serial")
public class BuscaUsuarioComNomeNuloException extends Exception {
	public BuscaUsuarioComNomeNuloException(String message)
    {
       super(message);
    }
}