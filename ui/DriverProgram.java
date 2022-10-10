package ui;

import java.util.Scanner;

public class DriverProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido al programa de conservación de especies marinas.");

        System.out.println("Ingrese su manera de ingreso.");
        System.out.println("1. Invitado.\n2. Colaborador.");
        int option = Integer.parseInt(in.nextLine());

        switch (option) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Ingrese una opción válida.");
                break;
        }

        in.close();
    }
}
