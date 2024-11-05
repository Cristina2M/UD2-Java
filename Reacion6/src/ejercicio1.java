import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) throws Exception {
//1. Escribir por pantalla cada carácter de una cadena introducida por teclado.
        String palabra;
        char caracter;
      
        System.out.print("Introduzca una palabra o frase: ");
        Scanner entrada= new Scanner(System.in);
        palabra = entrada.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            caracter=palabra.charAt(i);
            System.out.println(caracter);
        }
        

    entrada.close();
    }
}
