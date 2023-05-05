package SAB.Exception;

@SuppressWarnings("serial")
public class UsuarioJaRegistradoException extends Exception {
	public UsuarioJaRegistradoException(String message)
    {
       super(message);
    }
}
