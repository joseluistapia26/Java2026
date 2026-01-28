/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lives2026;

/**
 *
 * @author Usuario
 */
public class Elementos {
    
    public static final int SIGLO=100;
    public static double valor1;
    
    public static void imprimir(String msg){
        System.out.println(msg);
    }
    
    public static double suma(double x, double y){
        return (x+y);
    }
    
    public static double resta(double x, double y){
        return (x-y);
    }

    public Elementos() {
    }

    public Elementos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Elementos(String nombre) {
        this.nombre = nombre;
    }
    
    private String nombre;
    public int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getData(){
        return this.nombre+" "+this.edad;
    }
    
}
