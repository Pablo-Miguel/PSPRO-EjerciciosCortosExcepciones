/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excep.excepcion1;

/**
 *
 * @author Dam
 */
public class Excepcion1 {
    
    public static void main(String[] args) {
        int numero[]=new int[5];
        try{
            numero[7]=0;
        } catch (ArrayIndexOutOfBoundsException evt){
            System.out.println(evt.getMessage());
        }
        
    }
}
