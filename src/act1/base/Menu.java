/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1.base;

/**
 *
 * @author Asus
 */
public class Menu {
    //Propiedades
private String nombre;
private String tipo;
private double precio;
//constructores por defecto
public Menu(){
}
//constructores con parametro
public Menu(String nombre,String tipo,double precio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
} 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void mostrarDatos(){
        System.out.println("Informacion del menu");
        System.out.println("nombre: "+ nombre);
        System.out.println("tipo: "+tipo);
        System.out.println("precio: "+ precio);
    }
    
}

