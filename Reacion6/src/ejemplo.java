import java.util.Scanner;//IMPORTANTE

public class ejemplo {
    public static void main(String[] args) throws Exception {
        String nombre;
        System.out.print("Introduzca su nombre: ");
        Scanner entrada= new Scanner(System.in);
        nombre = entrada.nextLine();//si ponemos solo next, sin el Line, solo lee hasta que encuentra un espacio en blanco, es decir, solo lee una palabra
        System.out.println("Hola, " + nombre);
        entrada.close();
    }
}