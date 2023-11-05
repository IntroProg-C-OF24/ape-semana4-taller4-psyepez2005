package ape_senama4_soluciones_pedroyep;
import java.util.Scanner;
public class PagarServicios_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costoNetflix, costoYoutube, costoDropbox, costoSpotify, costoTotal;
        System.out.println("Ingrese costo mensual Netflix: ");
        costoNetflix = teclado.nextDouble();
        System.out.println("Ingrese costo mensual Youtube Premium: ");
        costoYoutube = teclado.nextDouble();
        System.out.println("Ingrese costo mensual Dropbox: ");
        costoDropbox = teclado.nextDouble();
        System.out.println("Ingrese costo mensual Spotify: ");
        costoSpotify = teclado.nextDouble();
        costoTotal = costoNetflix + costoYoutube + costoDropbox + costoSpotify;
        System.out.print("Ingrese la edad de la persona: ");
        int edad = teclado.nextInt();

        if (edad <= 30) {
            double descuento = costoTotal - (0.20 * costoTotal);
            costoTotal = descuento;
            System.out.println("Costo total mensual: " + costoTotal);
            }
        else {
            System.out.println("Costo total sin descuento: " + costoTotal);
        }
        }

    }