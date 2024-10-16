/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1.base;

/**
 *
 * @author Asus
 */
public class Restaurante {
    //Propiedades
private String nombre;
private String especialidad;
private int capacidad;
private String ubicacion;
private String contacto;

//Constructores por defecto
public Restaurante(){
}
//constructores 
public Restaurante(String nombre, String especialidad, int capacidad, String ubicacion, String contacto){
    this.nombre=nombre;
    this.capacidad=capacidad;
    this.especialidad=especialidad;
    this.ubicacion=ubicacion;
    this.contacto=contacto;
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para 'especialidad'
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Getter y Setter para 'capacidad'
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Getter y Setter para 'ubicacion'
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Getter y Setter para 'contacto'
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
 public void mostrarDatos(){
        System.out.println("Informacion de Restaurante");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Especialidad: "+especialidad);
        System.out.println("Capacidad: "+ capacidad);
        System.out.println("Ubicacion: "+ ubicacion);
        System.out.println("Contacto: "+ contacto);
 }
}
