/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1;

import act1.base.Cliente;
import act1.base.Menu;
import act1.base.Restaurante;

/**
 *
 * @author Asus
 */
public class Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu=new Menu("Familiar","Comidas rapidas",20.2);
        Restaurante restaurante=new Restaurante("Emily's","Comida Italiana",50,"Centro historico de Cartagena","300452817");
        Cliente cliente=new Cliente("Daniela Zuñiga","Pastas","20","3202235876");
        
        System.out.println("Codigo: 7502410013");
        System.out.println("Valentina del Rosario Zuñiga Vasquez");
        System.out.println("*****************************************");
        
        menu.mostrarDatos();
        System.out.println("");
        restaurante.mostrarDatos();
        System.out.println("");
        cliente.mostrarDatos();
    }
    
}
