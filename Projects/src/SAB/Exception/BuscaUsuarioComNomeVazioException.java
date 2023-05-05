package SAB.Exception;

@SuppressWarnings("serial")
public class BuscaUsuarioComNomeVazioException extends Exception {
	public BuscaUsuarioComNomeVazioException(String message)
    {
       super(message);
    }
}