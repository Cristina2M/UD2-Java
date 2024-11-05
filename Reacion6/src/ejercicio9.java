import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) throws Exception {
//9. Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.
    Scanner entrada= new Scanner(System.in);
        String cadena, subcadena;
        int contador=0, i2=0;

        System.out.println("Introduce una cadena: ");
        cadena=entrada.nextLine();
        System.out.println("Introduce una subcadena: ");
        subcadena=entrada.nextLine();

        for (int i = 0; i < (cadena.length()-subcadena.length()+1); i++) {
            i2++;
            if (subcadena.equals(cadena.substring(i, subcadena.length()+i))) {
                System.out.println("La cadena contiene la subcadena.");
            }
             else {
                contador++;
             }
        }
        if (contador == i2){
            System.out.println("La cadena no contiene la subcadena.");
        }
    entrada.close();
    }
}