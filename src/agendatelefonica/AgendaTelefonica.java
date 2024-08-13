package agendatelefonica;

import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {
        numero datos[] = new numero[15];
        Scanner entrada = new Scanner(System.in);
        Scanner letra = new Scanner(System.in);
        int op = 0;

        while (op != 5) {
            System.out.println("----Menu----");
            System.out.println("1. guardar numero");
            System.out.println("2. buscar individual");
            System.out.println("3. ver todo");
            System.out.println("4. modificar");
            System.out.println("5. salir");
            op = entrada.nextInt();
            if (op == 1) {
                System.out.println("Ingrese numero:  ");
                int numerotel = entrada.nextInt();
                System.out.println("Ingrese nombre: ");
                String nombre = letra.nextLine();
                System.out.println("Ingrese el correo electronico: ");
                String correo = letra.nextLine();
                System.out.println(nuevo(numerotel, nombre, correo, datos));

            } else if (op == 3) {
                System.out.println(imprimir(datos));
            } else if (op == 2) {
                System.out.println("ingrese numero");
                int numerotel = entrada.nextInt();
                System.out.println(buscar(numerotel, datos));
            } else if (op == 4) {
                System.out.println("ingrese numero para modificar");
                int numerotel = entrada.nextInt();
                if (modificardato(numerotel, datos)) {
                    System.out.println("ingrese el nombre");
                    String nombre = letra.nextLine();
                    System.out.println("ingrese el correo");
                    String correo = letra.nextLine();
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
                return " \n ¡NUMERO EXISTENTE!";
            }

        }
        if (!lleno) {
            return " \n ¡Se Guardo Con Exito! \n";
        } else {
            return "¡¡ESPACIO LLENO!!";
        }

    }

    public static String imprimir(numero arreglo[]) {
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                cadena = cadena + arreglo[i].getNumerotel() + "|" + arreglo[i].getNombre() + "|" + arreglo[i].getCorreo() + "\n";
            }
        }
        return cadena;
    }

    public static boolean modificardato(int numerotel, numero arreglo[]) {

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getNumerotel() == numerotel) {
                return true;
            }
        }
        return false;
    }

    public static String modificar(int numerotel, String nombre, String correo, numero arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getNumerotel() == numerotel) {
                arreglo[i].setNombre(nombre);
                arreglo[i].setCorreo(correo);
                return "¡Se Actualizo Con Exito!";
            }

        }
        return "no se modifico";
    }

    public static String buscar(int numerotel, numero arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getNumerotel() == numerotel) {
                return "los datos \n nombre: " + arreglo[i].getNombre() + " " + "correo : " + arreglo[i].getCorreo();
            }
        }
        return " \n NO EXISTE \n";
    }
}
