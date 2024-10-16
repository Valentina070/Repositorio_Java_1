/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1.base;

/**
 *
 * @author Asus
 */
public class Cliente {
// Propiedades
private String nombre;
private String preferencias;
private String edad;
private String contacto;

// Constructor por defecto
public Cliente(){
}
// Constructor con parámetros
    public Cliente(String nombre, String preferencias, String edad, String contacto) {
        this.nombre = nombre;
        this.preferencias = preferencias;
        this.edad = edad;
        this.contacto = contacto;
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
     public void mostrarDatos(){
       System.out.println("Informacion de cliente");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Preferencia: "+preferencias);
        System.out.println("Edad: "+ edad);
        System.out.println("Contacto: "+ contacto);
     }
}

