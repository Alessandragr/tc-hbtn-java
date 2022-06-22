public class Quadrado {
    public static double area(double lado) {
        if(lado>0) {
            double calculo = lado*lado;
            return calculo;
        } else {
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
    }
}
