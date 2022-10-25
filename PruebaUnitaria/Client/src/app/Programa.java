package app;

import java.util.Scanner;
import Consigna01.Factorial;


public class Programa {
    public Programa() {
        super();
    }
    private static Factorial factorial = new Factorial(); 
    
    public static void main(String[] args) {
        Programa programa = new Programa();
        
        boolean datoNoNumerico = true; 
         Long resultado = new Long(0);
         Long n = new Long(0);
         String entrada = new String("");
         Scanner teclado = new Scanner(System.in);
         try {
         do {
         System.out.print("Escribir un número entero => "); 
         entrada = teclado.nextLine();
         entrada = entrada.trim();
         if(entrada.isEmpty() == true || entrada.equals("") ==true) {
        System.out.println("Dato de entrada no numérico");
        datoNoNumerico = false;
        }else {
        try {
        n = Long.valueOf(entrada);
        if(n >= 0 && n <= 20) {
        resultado = factorial.calcular(n);
        System.out.println("El factorial de " + n + " es igual a " + resultado);
        }else {
        System.out.println("El número debe estar entre 0 y 20");
        } 
        }catch(Exception er){
        System.out.println("Error de entrada: " + 
        er.getMessage());
        }
        }
        } while (datoNoNumerico == true);
        }catch(Exception er ) {
        System.out.println("Error en el programa: " + er.getMessage());
        }
        System.out.println("El programa ha terminado"); 
        
    }
}
