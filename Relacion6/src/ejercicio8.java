import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) throws Exception {
//8. Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.
    Scanner entrada= new Scanner(System.in);
    String cadena, cadenaModf="";

        System.out.println("Introduce una cadena: ");
        cadena=entrada.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(cadena.substring(i, i+1).toUpperCase())) {
                cadenaModf= cadenaModf + cadena.substring(i, i+1).toLowerCase();
            } else {
                cadenaModf= cadenaModf + cadena.substring(i, i+1).toUpperCase();
            }
        }
        System.out.println("La cadena modificada sería: " + cadenaModf);
    entrada.close();
    }
}
