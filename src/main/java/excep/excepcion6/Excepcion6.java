/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excep.excepcion6;

/**
 *
 * @author Dam
 */
public class Excepcion6 {

    public static void main(String args[]) {
        int num[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int den[] = {2, 0, 4, 4, 0, 8};
        try {
            for (int i = 0; i < num.length; i++) {
                try //try interno
                {
                    System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
                } catch (ArithmeticException Excep) {
                    System.out.println("División por cero " + i);
                }
            }
        } //try externo
        catch (Throwable Excep) {
            System.out.println("Ocurrio una excepcion fatal ");
        }

        System.out.println("El programa continu aqui");
    } // fin de main}
}
