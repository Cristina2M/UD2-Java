import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) throws Exception {
//3. Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuántas veces aparece el carácter en la cadena.
    Scanner entrada= new Scanner(System.in);
        String cadena, letra, caracter;
        int contador=0;


        System.out.println("Introduce una cadena: ");
        cadena = entrada.nextLine();

        System.out.println("Introduce un caracter: ");
        caracter = entrada.nextLine();

        while (caracter.length() != 1) {
            System.out.println("Error. Debes introducir sólo un carácter.");
            caracter = entrada.nextLine();
        }
          
        for (int i = 0; i < cadena.length(); i++) {
            letra=cadena.substring(i, i+1);
            if (letra.equals(caracter)) {
                contador++;
            }
        }

        System.out.println("Ese caracter aparece " + contador + " veces");
    entrada.close();
    }
}
