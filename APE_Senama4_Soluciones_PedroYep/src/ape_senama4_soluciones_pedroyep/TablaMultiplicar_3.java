package ape_senama4_soluciones_pedroyep;
import java.util.Scanner;
public class TablaMultiplicar_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entre 2 y 6: ");
        int numero = scanner.nextInt();

        if (numero >= 2 && numero <= 6) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 12; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } 
        else {
            System.out.println("El numero ingresado no esta en el rango de 2 a 6.");
        }
    }
}