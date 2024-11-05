import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) throws Exception {
//4. Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente cuántas palabras tiene.
    Scanner entrada= new Scanner(System.in);
        String frase, letra;
        int contador=1;


        System.out.println("Introduce una frase: ");
        frase = entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            letra=frase.substring(i, i+1);
            if (letra.equals(" ")) {
                contador++;
            }
        }

        System.out.println("La frase tiene " + contador + " palabras.");
    entrada.close();
    }
}
