import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            op = opciones();
            switch (op) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

                default:
                    System.out.println("Esta opcion no existe");
                    break;
            }

        } while (op < 3);
    }

    static int opciones() {
        int op;
        System.out.println("1. Registrar usuario");
        System.out.println("2. Realizar prestamo");
        System.out.println("3. ");
        op = teclado.nextInt();
        return op;
    }
}
