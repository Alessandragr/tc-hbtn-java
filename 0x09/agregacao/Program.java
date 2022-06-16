public class Program {
    public static void main(String[] args) {
    	//System.out.println("comecou");
        Endereco endereco = new Endereco("Rua Marechal Deodoro",
                "135",
                "",
                "Santo Amaro",
                "Sao Paulo",
                "SP",
                "Brasil");
        //System.out.println("passou do endereco");

        Empregado empregado = new Empregado("Jane Doe", 1, endereco);
        //System.out.println("passou do empregado");

        empregado.apresentar();
        //System.out.println("passou do apresentar");

        //System.out.println();
    }
}