
public class ErroSemCaneca extends Exception{
	
	private static final long serialVersionUID = -5128295053180705840L;

	public ErroSemCaneca() {
		super("Voc� deixou o caf� na mesa, mas esqueceu que n�o tem caf� l�!");
	}
}
