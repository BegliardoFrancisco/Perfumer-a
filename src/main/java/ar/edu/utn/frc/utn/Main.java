package ar.edu.utn.frc.utn;


import ar.edu.utn.frc.utn.entities.Venta;
import ar.edu.utn.frc.utn.entities.Ventas;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1- Cargar una colección de objetos del tipo Venta el archivo \"ventas.csv\". " +
                "\n2- Mostrar todos los datos de las ventas cuyo importe de factura sea mayor a x y el tipo de la factura sea distinto de t (x y t son valores que se cargan por teclado). El listado debe salir ordenado el nombre de las personas que realizaron la compra. " +
                "\n3- Determinar y mostrar el importe total facturado para uno de los 17 tipos posibles. " +
                "\n4- Mostrar por pantalla el número de factura, el comprador y el importe, de todas las ventas cuyo tipo de perfume se encuentre entre 5 y 12 y que no sean con factura de tipo C. Si no existe ninguna venta que cumpla con ese criterio disparar NoSuchElementException. " +
                "\n5- Obtener una sublista de ventas, para aquellas ventas de un tipo de factura determinada. Si no existen elementos, disparar NoSuchElementException");


        Ventas ventas = new Ventas();
        while (true) {

            System.out.println("\n Ingresar una opción");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            if (option == 0) { break;}

            if (option == 1) {
                System.out.println("\nopción 1");

                URL url = Main.class.getResource("/ventas.csv");

                try {
                    if (url != null) {
                        ventas.InsertVenta(url);
                        ventas.getVentas().forEach(System.out::println);
                    } else {
                        System.out.println("\n URL es nula");
                    }
                } catch (URISyntaxException e) {
                    System.out.println("\n URL no encontrada");
                } catch (IOException e) {
                    System.out.println("\n Archivo no encontrado");
                }

            }
            if (option == 2) {
                System.out.println("\nopción 2");
                System.out.println("\nIngrese el tipo factura q no desea buscar A,B,C,D");
                char tipo = sc.next().charAt(0);
                System.out.println("\nIngrese el importe minimo");
                float importe = sc.nextFloat();
                List<Venta> resultado = ventas.importeTipoFilter(tipo, importe);
                resultado.forEach(System.out::println);
            }
            if (option == 3) {
                System.out.println("\nopción 3");
                System.out.println("\nIngrese el tipo perfume q desea buscar");

                int perfume = sc.nextInt();
                float total = ventas.totalPorTipos(perfume);

                System.out.println("\n EL MONTO TOTAL DEL TIPO"+ perfume + ":" + total );
            }
            if (option == 4) {
                System.out.println("\nopción 4");

            }
            if (option == 5) {
                System.out.println("\nopción 5");

            }
        }

    }
}

