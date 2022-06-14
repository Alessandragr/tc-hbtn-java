public class InteiroPositivo {
	public static void main(String[] args) {
		 try {
			 private int valor;
			 public Numero (int valor) {
				  Integer valor =  new Integer(2);
				  ehInteiro();
			 }
			 public Texto (String valor) {
				 Integer valor =  new Integer("2");
				 ehInteiro();
			 }
		 } catch (IllegalArgumentException e) {
			 System.out.println(e);
		 }
		 public ehInteiro (int valor) {
			 try (Integer.parseInt(valor)) {
				 System.out.println("Valor eh um valor inteiro positivo");
			 } catch (IllegalArgumentException e) {
				 System.out.println("Valor nao eh um valor inteiro positivo");
			 }
		 }
		 public ehPrimo (int valor) {
			 for (int i=2; i<valor; i++) {
				  if(valor%i==0) {
					  return true;
				  } else {
					  return false;
				  }
			 }
		 }
	}
}
