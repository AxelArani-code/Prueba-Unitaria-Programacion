package Consigna01;

public class Factorial {
    public Factorial() {
        super();
    }


    public Long calcular (Long n) {
     if (n==0) return (long)1;
     else return (n * calcular(n-1));
     }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        
        
    }
}
