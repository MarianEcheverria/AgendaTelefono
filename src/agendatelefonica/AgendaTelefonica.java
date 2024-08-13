
package agendatelefonica;

import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {
       numero datos[] = new numero[15];
       Scanner entrada = new Scanner(System.in);
       int op = 0;
       
       while(op != 5){
           System.out.println("----Menu----");
           System.out.println("1. guardar numero");
           System.out.println("2. buscar");
           System.out.println("3. encontrar");
           System.out.println("4. modificar");
           System.out.println("5. salir");
           op = entrada.nextInt();
           if (op == 1){
               System.out.println("ingrese nombre ");
               String nombre= entrada.nextLine();
               System.out.println("ingrese numero telefonico ");
               int num = entrada.nextInt();
               System.out.println("ingrese el correo electronico");
               String gmail = entrada.nextLine();
             //  System.out.println(numero(num, nombre, gmail));
               
          // }else if(op == 2){
               
        //   }else if(op == 3){
               
           }
       }
    }
    
}
