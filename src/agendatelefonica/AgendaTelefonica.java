package agendatelefonica;

import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {
        numero datos[] = new numero[15];
        Scanner entrada = new Scanner(System.in);
        int op = 0;

        while (op != 5) {
            System.out.println("----Menu----");
            System.out.println("1. guardar numero");
            System.out.println("2. buscar");
            System.out.println("3. encontrar");
            System.out.println("4. modificar");
            System.out.println("5. salir");
            op = entrada.nextInt();
            if (op == 1) {
                System.out.println("ingrese nombre ");
                String nombre = entrada.nextLine();
                System.out.println("ingrese numero telefonico ");
                int numerotel = entrada.nextInt();
                System.out.println("ingrese el correo electronico");
                String correo = entrada.nextLine();
                System.out.println(nuevo(numerotel, nombre, correo, datos));

            } else if (op == 2) {
                System.out.println(imprimirtodo(datos));
            } else if (op == 3) {
                System.out.println("ingrese numero");
                int numerotel = entrada.nextInt();
                System.out.println(buscares(numerotel, datos));
            } else if (op == 4) {
                System.out.println("ingrese numero para modificar");
                int numerotel = entrada.nextInt();
                if (modificar(numerotel, datos)) {
                    System.out.println("ingrese el nombre");
                    String nombre = entrada.nextLine();
                    System.out.println("ingrese el correo");
                    String correo = entrada.nextLine();
                } else {
                    System.out.println("no existe el numero");
                }
            }

        }
    }

    public static String nuevo(int numerotel, String nombre, String correo, numero arreglo[]) {
        numero n1 = new numero(numerotel, nombre, correo);
        boolean lleno = true;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = new numero(numerotel, nombre, correo);
                lleno = false;
                break;

            } else if (arreglo[i].getNumerotel() == numerotel) {
                return "ya existe el numero";
            }

        }
        if (!lleno) {
            return "se guardo con exito";
        } else {
            return "espacio lleno";
        }

    }
public static String modificar
}
