/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excep.excepcion2;

/**
 *
 * @author Dam
 */
public class Excepcion2 {

    public void miMetodo() {
        int numero[] = new int[5];
        try {
            System.out.println("Accesando a una posicion fuera del vector");
            numero[7] = 0;
        } catch (ArrayIndexOutOfBoundsException excep) {
            System.out.println("Ocurrio una excepcion");
        }
    }
}
