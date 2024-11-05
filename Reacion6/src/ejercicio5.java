import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) throws Exception {
//5. Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en mayúsculas.
    Scanner entrada= new Scanner(System.in);
        String nombre,letra, iniciales="";

        System.out.println("Introduce tu nombre y apellidos: ");
        nombre=entrada.nextLine();

        iniciales=nombre.substring(0, 1);
        for (int i = 0; i < nombre.length(); i++) {
            letra=nombre.substring(i, i+1);
            if (letra.equals(" ")) {
                iniciales=iniciales+nombre.substring(i+1, i+2);
            }
        }

        System.out.println("Las iniciales son: " + iniciales.toUpperCase());

    entrada.close();



    }
}
