package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distanciaViaje;
        double consumoGasolina;
        double costoGasolina;
        String nombreUsuario;
        String placaVehiculo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Distancia Viaje Km: ");
        distanciaViaje = scanner.nextDouble();
        System.out.println("Ingrese Consumo Gasolina en Lt Cada 100 Km: ");
        consumoGasolina = scanner.nextDouble();
        System.out.println("Ingrese costo por Lt de Gasolina: ");
        costoGasolina = scanner.nextDouble();

        double litrosNecesarios = (distanciaViaje / 100.0) * consumoGasolina;
        double costoTotalGasolina = (litrosNecesarios * costoGasolina);

        System.out.println("Resumen Viaje");
        System.out.println("----------------");
        System.out.println("Distancia:" + distanciaViaje + "Km");
        System.out.println("Consumo Gasolina:" + consumoGasolina + "Lt/100Km");
        System.out.println("Precio por Lt Gasolina: $" + costoGasolina);
        System.out.println("---------------------------------------------");
        System.out.println("Total Litros necesarios: " + litrosNecesarios + "Lt");
        System.out.println("Costo Total Gasolina: $" + costoTotalGasolina );
    }
}