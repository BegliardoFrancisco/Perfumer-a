package ar.edu.utn.frc.utn;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1- Cargar una colección de objetos del tipo Venta el archivo \"ventas.csv\". " +
                "\n2- Mostrar todos los datos de las ventas cuyo importe de factura sea mayor a x y el tipo de la factura sea distinto de t (x y t son valores que se cargan por teclado). El listado debe salir ordenado el nombre de las personas que realizaron la compra. " +
                "\n3- Determinar y mostrar el importe total facturado para uno de los 17 tipos posibles. " +
                "\n4- Mostrar por pantalla el número de factura, el comprador y el importe, de todas las ventas cuyo tipo de perfume se encuentre entre 5 y 12 y que no sean con factura de tipo C. Si no existe ninguna venta que cumpla con ese criterio disparar NoSuchElementException. " +
                "\n5- Obtener una sublista de ventas, para aquellas ventas de un tipo de factura determinada. Si no existen elementos, disparar NoSuchElementException");

        System.out.println("\n Ingresar una opción");

        Scanner sc = new Scanner(System.in);

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: {
                System.out.println("\n Ingresar una opción 1");
                break;
            }
            case 2: {
                System.out.println("\n Ingresar una opción 2");
                break;
            }
            case 3: {
                System.out.println("\n Ingresar una opción 3");
                break;
            }
            case  4: {
                System.out.println("\n Ingresar una opción 4");
                break;
            }
            case 5: {
                System.out.println("\n Ingresar una opción 5");
                break;
            }
        }



    }
}