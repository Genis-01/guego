package Funciones;

import java.util.Scanner;


public class Basicas {
    public static Scanner sc = new Scanner(System.in);



    public static void cls() {// limpia la consola
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }



    public static String CajaDeHastag(String mensaje) {
        String hastag = "";
        for (int i = (mensaje.length() + 4); i > 0; i--) {
            hastag += "#";
        }
        return hastag + "\n# " + mensaje + " #\n" + hastag;
    }



    public static char LeerCharMin(String mensaje){
        String imput;
        char caracter;
        
        imput = sc.nextLine();
    
        while (imput.length()>1) {
            System.out.println("        *********");
            System.out.println("        * ERROR *");
            System.out.println("***************************");
            System.out.println("* el input no es correcto *");
            System.out.println("***************************");
            System.out.println(mensaje);
        }
        imput = imput.toLowerCase();
        caracter = imput.charAt(0);

        return caracter;
    }

    public static int PideYScaneaintPositivo(String Mensaje) {// muestra por pantalla un mensaje y devuelve el input del usuario
        // (un numero)
        int numero = -1;
        System.out.println(Mensaje);
        
        while (numero < 0) {

            while (!sc.hasNextInt()) {
                
                System.out.println("        *********");
                System.out.println("        * ERROR *");
                System.out.println("***************************");
                System.out.println("* el input no es correcto *");
                System.out.println("***************************");
                System.out.println("\n" + Mensaje);
                sc.nextLine();
            }
            numero = sc.nextInt();

            
            System.out.println("        *********");
            System.out.println("        * ERROR *");
            System.out.println("***************************");
            System.out.println("* el input no es correcto *");
            System.out.println("***************************");
            System.out.println("\n" + Mensaje);
            sc.nextLine();
        }
        
        
        return numero;
    }
}
