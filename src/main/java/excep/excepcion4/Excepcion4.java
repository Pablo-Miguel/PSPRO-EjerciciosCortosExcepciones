/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excep.excepcion4;

/**
 *
 * @author Dam
 */
public class Excepcion4 {

    static void divide() {
        int num[] = {4, 8, 16, 32, 64, 128, 256};
        int den[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < num.length + 1; i++) {
            try {
                System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
            } catch (ArithmeticException e) {
                System.out.println("Dividiendo por cero");
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("Array fuera de intervalo");
            }
        }
    }
}
