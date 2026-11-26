/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejemplo061 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        
        while (bandera == true){
            System.out.println("Estoy en el ciclo");
            
            int salir;
            System.out.println("Desea salir del ciclo, ingrese -100.");
            salir = entrada.nextInt();
            if (salir == -100){
                bandera = false;
            }
        }
    }
}
/*
El codigo nos muestra un ciclo repetitivo sin el if tendriamos un ciclo infinito
y ya con este ponemos la condicion de que si bandera el igual a -100 transforma
la variable bandera en falso y la condicion de bandera == true ya es falsa por
lo tanto salimos del ciclo infinito
*/