package capitulo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FornecedorImplementacoes {
	
	public static void main(String[] args) {
		try {
			FornecedorImplementacoes f = new FornecedorImplementacoes(
					"implementacoes.prop");
			Class<?> impl = f.getImplementacao(DAO.class);
			System.out.println("Implementação recuperada: " + impl.getName());
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Problemas ao obter implementacões:"
					+ e.getMessage());
		}
	}

	private Map<Class<?>, Class<?>> implementacoes = new HashMap<>();

	public FornecedorImplementacoes(String nomeArquivo) throws IOException,
			ClassNotFoundException {
		Properties p = new Properties();
		p.load(new FileInputStream(nomeArquivo));
		for (Object interf : p.keySet()) {
			Class<?> interfType = Class.forName(interf.toString());
			Class<?> implType = Class.forName(p.get(interf).toString());
			implementacoes.put(interfType, implType);
		}
	}

	public Class<?> getImplementacao(Class<?> interf) {
		return implementacoes.get(interf);
	}
}
