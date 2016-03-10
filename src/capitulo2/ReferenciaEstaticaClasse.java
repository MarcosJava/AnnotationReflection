package capitulo2;

/**
 * 
 * @author markFelipe
 * Ja contem um .class
 */
public class ReferenciaEstaticaClasse {

	public static void main(String[] args) {
		Class<String> classe = String.class;
		System.out.println(classe.getName());
		imprimeNomeClasse(Integer.class);
	}

	public static void imprimeNomeClasse(Class<?> classe) {
		System.out.println("Chamado o método com " + classe.getName());
	}

}
