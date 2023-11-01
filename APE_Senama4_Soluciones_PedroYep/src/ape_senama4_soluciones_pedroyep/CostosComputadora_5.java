package ape_senama4_soluciones_pedroyep;

import java.util.Scanner;

public class CostosComputadora_5 {

    public static void main(String[] args) {
        double cpu, pteclado, pantalla, raton, costoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el costo del CPU: ");
        cpu = teclado.nextDouble();
        System.out.println("Ingresar el costo del teclado: ");
        pteclado = teclado.nextDouble();
        System.out.println("Ingresar el costo de la pantalla: ");
        pantalla = teclado.nextDouble();
        System.out.println("Ingresar el costo del raton: ");
        raton = teclado.nextDouble();
        costoTotal = cpu + pteclado + pantalla + raton;
        System.out.println("El costo total de la planilla es: " + costoTotal);

    }
}