import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) throws Exception {
//10. Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.
    Scanner entrada= new Scanner(System.in);
        String cadena, cadena2="";
        
        System.out.println("Introduce una cadena: ");
        cadena=entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            cadena2= (cadena.substring(i, i+1) + cadena2);
        }
        if (cadena2.equals(cadena)) {
            System.out.println("La cadena introducida es un palíndromo.");
        } else {
            System.out.println("La cadena introducida no es un palíndromo.");
        }
    entrada.close();
    }
}
