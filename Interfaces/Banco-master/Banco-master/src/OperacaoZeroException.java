public class OperacaoZeroException extends RuntimeException {
    
	private static final long serialVersionUID = 7682145821124735816L;

	public OperacaoZeroException(String operacao) {
        super("N�o � poss�vel " + operacao + " zero reais.");
    }
}
