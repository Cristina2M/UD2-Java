import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) throws Exception {
//2. Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado.
    Scanner entrada= new Scanner(System.in);
        String frase, caracter;
        

        System.out.println("Introduzca una palabra o frase: ");
        frase = entrada.nextLine();

        System.out.print("Introduzca un caracter: ");
        caracter = entrada.nextLine();

            if (frase.startsWith(caracter)==true) {
                System.out.println("La cadena empieza por el caracter introducido.");
            } else {
                System.out.println("No empiezan por el mismo caracter.");
            }
            
        
        

        entrada.close();
    }
}
