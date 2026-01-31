/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lives2026;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 * @Date 29-01-2026
 */
public class Condicionales {
    
    static Scanner lc = new Scanner(System.in);

    public static void main(String[] args) {
        eje6();
    }

    private static void eje1() {
        Scanner lec = new Scanner(System.in);
        int codigo;
        System.out.print("Ingrese un codigo:");
        String dato = lec.nextLine();
        codigo = Integer.parseInt(dato);
        switch (codigo) {
            case 200, 201:
                System.out.println("Exito: Solicitud procesada.");
                break;
            case 400, 404:
                System.out.println("Error detectado!");
                break;
            default:
                System.out.println("Codigo no existe!!");
        }
    }

    private static void eje2() {
        Scanner lec = new Scanner(System.in);
        int codigo;
        System.out.print("Codigo:");
        String dato = lec.nextLine();
        codigo = Integer.parseInt(dato);
        String msg = switch (codigo) {
            case 200, 201 ->
                "Exito: Solicitud procesada";
            case 400, 404 ->
                "Error detectado!";
            default ->
                "Estado desconocido";
        };
        System.out.println(msg);
    }

    private static void eje3() {
        int edad;
        Scanner lec = new Scanner(System.in);
        System.out.print("Edad:");
        edad = lec.nextInt();
        if (edad > 17) {
            System.out.println("Mayor de edad!");
        } else {
            System.out.println("Menor de edad!");
        }
    }

    private static void eje4() {
        String nombre;
        Scanner lec = new Scanner(System.in);
        System.out.print("Nombre:");
        nombre = lec.nextLine().toUpperCase();
        System.out.println(nombre);
        if ("ANA".equals(nombre) || "MARIA".equals(nombre)
                   || "CARLOS".equals(nombre)) {
            System.out.println("es de la ciudad");
        }else{
             System.out.println("Es del Campo");
        }
    }
    
    private static void eje5(){
        String estudiante, asignatura, dato;
        double n1,n2,n3,pr;
        System.out.print("Estudiante:");
        estudiante = lc.nextLine();
        System.out.print("Asignatura:");
        asignatura = lc.nextLine();
        System.out.print("Nota 1:");
        dato = lc.nextLine();
        n1 = Double.parseDouble(dato);
        System.out.print("Nota 2:");
        dato = lc.nextLine();
        n2 = Double.parseDouble(dato);
        System.out.print("Nota 3:");
        dato = lc.nextLine();
        n3 = Double.parseDouble(dato);
        pr = (n1+n2+n3)/3;
        System.out.println("El promedio es:"+pr);
        if (pr<0 || pr>10) {
            System.out.println("Promedio Incorrecto!");
        }else{
            if(pr>=0 && pr<7){
                System.out.println(estudiante+" esta Reprobado!");
            }
            if(pr>=7 && pr<=10){
                System.out.println(estudiante+" esta Aprobado");
            }
        }
    }
    
    private static void eje6(){
        Inputs inp = new Inputs();
        var nombre = inp.inputStr("Nombre:");
        var apellido = inp.inputStr("Apellido:");
        var direccion = inp.inputStr("Direccion:");
        var edad = inp.inputInt("Edad:");
        var sueldo = inp.inputDouble("Sueldo:");
        System.out.println(nombre+" - "
                +apellido+" - "+direccion+
                " - "+edad+" - "+sueldo);  
    }
}
