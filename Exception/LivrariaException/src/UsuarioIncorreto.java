
public class UsuarioIncorreto extends RuntimeException{

	private static final long serialVersionUID = -1639768949199759908L;

	public UsuarioIncorreto() {
		super("Usu�rio ou senha Incorretos!");
	}
}
