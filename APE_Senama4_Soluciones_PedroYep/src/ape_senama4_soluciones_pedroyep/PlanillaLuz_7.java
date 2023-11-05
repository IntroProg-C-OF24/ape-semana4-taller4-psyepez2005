package ape_senama4_soluciones_pedroyep;
import java.util.Scanner;
public class PlanillaLuz_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double kbConsum, valorKb, planilla;
        System.out.println("Ingrese los Kb consumidos: ");
        kbConsum = teclado.nextDouble();
        System.out.println("Ingrese el valor de los Kb: ");
        valorKb = teclado.nextDouble();
        System.out.println("Ingrese la edad del cliente: ");
        int edad = teclado.nextInt();
        planilla =  kbConsum * valorKb;
        double descuento = planilla - (0.10 * planilla);
        if (edad <= 65) {
            System.out.println("Costo total sin descuento: " + planilla);
            }
        else {
            System.out.println("Costo total con descuento: " + descuento);
        }
        }
    }