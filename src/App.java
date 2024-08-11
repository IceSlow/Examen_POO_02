import java.util.Scanner;

import clases.clsListaUsuarios;
import clases.clsUsuario;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        clsListaUsuarios listaU = new clsListaUsuarios();
        int op;
        do {
            op = opciones();
            switch (op) {
                case 1:
                    if (listaU.espacioLleno()) {
                        clsUsuario nuevo = new clsUsuario();
                        registrarUsuario(listaU, nuevo);
                        listaU.registrar(nuevo);
                    } else {
                        System.out.println("El espacio de alumnos esta lleno");
                    }
                    break;
                case 2:
                    System.out.println(listaU.mostrarLista());
                    break;
                case 3:

                    break;
                default:
                    System.out.println("Esta opcion no existe");
                    break;
            }

        } while (op < 3);
    }

    static void registrarUsuario(clsListaUsuarios listaU, clsUsuario usuario) {
        String nombre, codigo;
        int edad;
        System.out.println("Ingrese su nombre");
        nombre = teclado.next();
        System.out.println("Ingrese su edad:");
        edad = teclado.nextInt();

        do {
            System.out.println("Ingresar su codigo");
            codigo = teclado.next();
        } while (listaU.buscarCodigo(codigo));

        usuario.setCodUsuario(codigo);
        usuario.setEdad(edad);
        usuario.setNomUsuario(nombre);
    }

    static int opciones() {
        int op;
        System.out.println("1. Registrar usuario");
        System.out.println("2. Mostrar usuarios");
        System.out.println("3. Realizar prestamo");
        op = teclado.nextInt();
        return op;
    }
}
