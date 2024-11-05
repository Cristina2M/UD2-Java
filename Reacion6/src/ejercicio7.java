import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) throws Exception {
//7. Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en la cadena por el segundo carácter.
    Scanner entrada= new Scanner(System.in);
        String cadena, caracter1, caracter2;

        System.out.println("Escribe una cadena: ");
        cadena=entrada.nextLine();
        System.out.println("Escribe un caracter que aparezca en la cadena y quiera sustituir: ");
        caracter1=entrada.nextLine();
        while (caracter1.length() != 1) {
            System.out.println("Error. Debes introducir sólo un carácter.");
            caracter1 = entrada.nextLine();
        }
        System.out.println("Escribe el caracter por el que lo quiere reemplazar: ");
        caracter2=entrada.nextLine();
        while (caracter2.length() != 1) {
            System.out.println("Error. Debes introducir sólo un carácter.");
            caracter2 = entrada.nextLine();
        }
        
        
        System.out.println("La cadena modificada sería: " + cadena.replace(caracter1, caracter2));
    entrada.close();
    }
}
