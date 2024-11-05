import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) throws Exception {
//6. Realizar un programa que dada una cadena de caracteres por caracteres, genere otra cadena resultado de invertir la primera.
    Scanner entrada= new Scanner(System.in);
        String letra, cadena="";
        

        System.out.println("Escribir caracter por caracter la cadena que quiere invertir(para indicar el final, escriba .): ");
        do {
            letra = entrada.nextLine();
        cadena = (letra+cadena);
            }
            while (letra.equals(".")==false);
        System.out.println("La cadena escrita del revés sería: " + cadena);

        entrada.close();
    }
}
