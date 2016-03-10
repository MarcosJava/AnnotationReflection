package capitulo1.annotation;

public class Telefone {

	private String codigoPais;
	private String operadora;

	public Telefone() {
		// TODO Auto-generated constructor stub
	}

	public Telefone(String codigoPais, String operadora) {
		super();
		this.codigoPais = codigoPais;
		this.operadora = operadora;
	}

	@NomePropriedade("codigoInternacional")
	public String getCodigoPais() {
		return codigoPais;
	}

	@Ignorar
	public String getOperadora() {
		return operadora;
	}

	@Override
	public String toString() {
		return "Telefone [codigoPais=" + codigoPais + ", operadora="
				+ operadora + "]";
	}
	
	
}
