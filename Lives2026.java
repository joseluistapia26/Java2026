package lives2026;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luis
 */
public class Lives2026 {

    public static void main(String[] args) {
        ejemplo2();
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
    
}
