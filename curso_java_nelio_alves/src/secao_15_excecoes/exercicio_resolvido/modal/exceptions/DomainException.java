package secao_15_excecoes.exercicio_resolvido.modal.exceptions;

//public class DomainException extends Exception {
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
