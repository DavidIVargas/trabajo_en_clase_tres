/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Contacto<T> {
    private T nombre;
    private T telefono;

    public Contacto(T nombre, T telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    

    public T getNombre() {
        return nombre;
    }

    public T getTelefono() {
        return telefono;
    }
    
}