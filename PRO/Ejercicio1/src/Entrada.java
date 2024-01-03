import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Esto es un ejemplo de ejecucion");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica tu nombre");
        String nombre = scanner.next();
        System.out.println("El nombre introducido es "+nombre);

    }
}
