/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excep.excepcion7;

/**
 *
 * @author Dam
 */
public class Excepcion7 {

    public static void generaExcepcion(int i) {
        int t;
        int num[] = {2, 4, 6};
        System.out.println("Recibiendo " + i);
        try {
            switch (i) {
                case 0:
                    t = 10 / i; //division por cero
                    break;
                case 1:
                    num[4] = 4; //genera un error
                    break;
                case 2:
                    return;
            }
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Ejecutando código de limpieza");
        }
        

    } //fin de metodo
}
