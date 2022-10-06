/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excep.excepcion5;

/**
 *
 * @author Dam
 */
public class Excepcion5 {

    public static void main(String args[]) {
        int num[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int den[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
        }
    } // fin de main
}
