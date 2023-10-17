package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        String lastName;
        long idNumber;
        long balance;
        boolean isActiveInTheSystem;
        String address;
        String cityOfResidence;
        String civilStatus;
        String profession;
        long monthlyIncome;
        String levelOfStudies;
        String placeOfBrirth;

        LocalDate birthDate;


        System.out.println("Hello world!");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        name = myScanner.next();

        System.out.println("Ingresa tu apellido:");
        lastName = myScanner.next();

        System.out.println("Ingresa tu numero de identidad:");
        idNumber = myScanner.nextLong();

        System.out.println("Ingresa tu saldo:");
        balance = myScanner.nextLong();

        System.out.println("Esta activo en el sistema: ");
        isActiveInTheSystem = myScanner.nextBoolean();
        myScanner.nextLine();

        System.out.println("Ingresa tu direccion:");
        address = myScanner.nextLine();

        System.out.println("Ciudad de residencia");
        cityOfResidence = myScanner.nextLine();

        System.out.println("Estado civil: ");
        civilStatus = myScanner.nextLine();

        System.out.println("Profesion:");
        profession = myScanner.nextLine();

        System.out.println("Ingresos mensuales:");
        monthlyIncome = myScanner.nextLong();
        myScanner.nextLine();

        System.out.println("Nivel de estudios:");
        levelOfStudies = myScanner.nextLine();

        System.out.println("Lugar de naciemiento: ");
        placeOfBrirth = myScanner.nextLine();

        System.out.println("Fecha de nacimiento AAAA/MM/DD:");
        String  dateImput = myScanner.nextLine();
        try {
            birthDate = LocalDate.parse(dateImput);
            System.out.println(" Fecha de nacimiento correcta para formato LocalDate: " + birthDate);
        }catch (Exception e){
            System.out.println(" Formato de fecha oncorrecto. Verifique qeu es formato sea AAAA-MM-DD");
        }

        String information = printMainInformation(name, lastName, idNumber, dateImput);
        System.out.println(information);

    }


        static String printMainInformation (String name, String lastName, long idNumber, String dateImput){
            String print = " Nombre: " + name + "\n Apellido: " + lastName + "\n Numero de identidad: " + idNumber
            + "\n Fecha de nacimiento: " + dateImput;
            return print;
        }

}