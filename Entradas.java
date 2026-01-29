/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lives2026;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 * @Date 28-01-2026
 */
public class Entradas {

    public static void main(String[] args) {
        eje2();
    }

    private static void eje1() {
        Scanner lec = new Scanner(System.in);
        System.out.print("Ingrese su nombre:");
        String nombre = lec.next();
        System.out.print("Edad:");
        int edad = lec.nextInt();
        System.out.println("Su nombre es " + nombre);
        System.out.println("La edad es:" + edad);
    }

    private static void eje2() {
        String dato, nombre;
        int edad = 0;
        Scanner lec = new Scanner(System.in);
        System.out.print("Nombre:");
        nombre = lec.nextLine();
        System.out.println("Su nombre es:" + nombre);
        try {
            System.out.print("Edad:");
            dato = lec.nextLine();
            edad = Integer.parseInt(dato);
        } catch (Exception e) {
            System.out.println("Dato equivocado..");
            System.out.println("Excepcion : " + e);
        } finally {
            System.out.println("Nombre es " + nombre + " , tiene la edad " + edad);
        }

    }

}
