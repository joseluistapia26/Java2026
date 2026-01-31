/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lives2026;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Inputs {
    Scanner lec = new Scanner(System.in);
    
    public String inputStr(String msg){
        System.out.print(msg);
        String dato = lec.nextLine();
        return dato;   
    }
    
    public int inputInt(String msg){
        int valor=0;
        try{
        System.out.print(msg);
        String dato = lec.nextLine();
        valor = Integer.parseInt(dato);
        }catch(NumberFormatException e){
            System.out.println("Valor Invalido!!");
            System.out.println("Error:"+e);
            valor =0;
        }finally{
             return valor;
        }      
    }
    
    public double inputDouble(String msg){
        double valor=0;
        try{
            System.out.print(msg);
            String dato = lec.nextLine();
            valor = Double.parseDouble(dato);
        }catch(NumberFormatException e){
            System.out.println("Valor Incorrecto!");
            System.out.println("Erro:"+e);
            valor =0;
        }finally{
            return valor;
        }  
    }
}
