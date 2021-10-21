package exceptions;

public class EscritaNaoPermitidaException extends Exception {
	private static final long serialVersionUID = 1L;

	public EscritaNaoPermitidaException(String message){
        super("O Caminho n�o tem permiss�o de escrita: " + message);
	}
}