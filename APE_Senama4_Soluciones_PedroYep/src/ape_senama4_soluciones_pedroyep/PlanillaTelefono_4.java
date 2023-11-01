package ape_senama4_soluciones_pedroyep;

import java.util.Scanner;

public class PlanillaTelefono_4 {

    public static void main(String[] args) {
        double costo, minutos, costoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el costo: ");
        costo = teclado.nextDouble();
        System.out.println("Ingresar los minutos: ");
        minutos = teclado.nextDouble();
        costoTotal = costo * minutos;
        System.out.println("El costo total de la planilla es: " + costoTotal);

    }

}
