public class InteiroPositivo {
	public static void main(String[] args) {
		 try {
			 int valor;
			 public Numero (int valor) {
				  Integer valor =  new Integer(2);
				  ehInteiro();
			 }
			 public Texto (String valor) {
				 Integer valor =  new Integer("2");
				 ehInteiro();
			 }
		 } catch (Exception e) {
			 System.out.println(e);
		 }
		 public ehInteiro (int valor) {
			 if (Integer.parseInt(valor)) {
				 System.out.println("Valor eh um valor inteiro positivo");
			 } else {
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
