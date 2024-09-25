package org.example;

import org.example.MODELOS.Apartamento;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();

        System.out.println("Digite la direccion del Apto ");
        apartamento.setDireccion(lea.nextLine());

        System.out.println("Digite el numero de Habitaciones");
        apartamento.setNumeroHabitaciones(lea.nextInt());

        System.out.println("Digite la cantidad de metros cuadrados");
        apartamento.setMetrosCuadrados(lea.nextDouble());

        System.out.println("Indique si tiene balcon");
        apartamento.setTieneBalcon(lea.nextBoolean());

        System.out.println("Digite el piso del Apartamento");
        apartamento.setPiso(lea.nextInt());

        System.out.println("Digite el precio del Apartamento");
        apartamento.setPrecio(lea.nextInt());

        System.out.println(apartamento);


    }





}


