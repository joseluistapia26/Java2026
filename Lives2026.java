package lives2026;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luis
 */
public class Lives2026 {
   static int valor;
   static String palabra;
   
    
    public static void main(String[] args) {
        ejemplo6();
    }
    
    private static void prueba(){
        System.out.println("Bienvenidos a Java");
        int numero;
        numero = 10;
        System.out.println("Valor :"+numero);
        String nombre;
        nombre = "Jose Luis";
        System.out.println("Mi nombre es "+nombre);
        boolean res;
        res = true;
        System.out.println("Booleano "+res);  
    }
    
    private static void ejemplo1(){
        String nombre;
        int num ;
        var numero =0;
        var msg = "";
        System.out.println("Valor "+numero);
    }
    
    private static void ejemplo2(){
        int num = 90;
        String palabra="SAludo";
        palabra = palabra+" "+num + " hola "+20;
        System.out.println(palabra+" "+100);
        System.out.println(palabra);
        palabra = "Subtotal:"+20;
        palabra = palabra+"\nIva:"+30;
        System.out.println(palabra);
        JOptionPane.showConfirmDialog(null, palabra);
    }
    
    private static void ejemplo3(){
        valor = 200;
        System.out.println("Valor "+200);
    }
    
    private static void ejemplo4(){
        final double PI = 3.14;
        palabra = "Jose";
        int edad;
        var valor = 0;
        Scanner lec = new Scanner(System.in);
        System.out.print("Ingrese su edad:");
        edad = lec.nextInt();
        System.out.println("PI:"+PI);
    }
    
    private static void ejemplo5(){
        System.out.println("Constante:"+Elementos.SIGLO);
        Scanner lec = new Scanner(System.in);
        System.out.print("Ingresa un valor:");
        Elementos.valor1 = lec.nextDouble();
        Elementos.imprimir("El valor ingresado es:"+Elementos.valor1);
        double v1,r;
        var v2=0.0;
        System.out.print("Numero 1:");
        v1 = lec.nextDouble();
        System.out.print("Numero 2:");
        v2 = lec.nextDouble();
        r = Elementos.suma(v1, v2);
        Elementos.imprimir("La suma es:"+r);
        System.out.println("Total: %.2f".formatted(r));
    }
    
    private static void ejemplo6(){
        Elementos obE = new Elementos();
        Elementos obE2 = new Elementos();
        Elementos.imprimir("Clase 3");
        obE2.setNombre("Python");
        System.out.println("Valor "+obE2.getNombre());
        Elementos obE3 = new Elementos("Java",20);
        System.out.println(obE3.getNombre());
        System.out.println(obE3.edad);
        Elementos obj = new Elementos("C++");
        obj.edad=10;
        System.out.println(obj.getNombre());
        System.out.println(obj.getData());
    } 
    
}

