package capitulo2;

public class ExemploClasse {
	public String publico;
	private String privado;
	public static String estatico;

	public String repetir(String base, String divisor, Integer vezes) {
		String retorno = base;
		for (int i = 1; i < vezes; i++) {
			retorno += divisor + base;
		}
		return retorno;
	}
}
