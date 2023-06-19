/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Agenda<T> {
    private ListaEnlazada<T> contactos;

    public Agenda() {
        contactos = new ListaEnlazada<>();
    }

    public void agregarContacto(T nombre, T telefono) {
        Contacto<T> contacto = new Contacto<>(nombre, telefono);
        contactos.agregar((T) contacto);
    }

    public T buscarContacto(T nombre) {
        return contactos.buscar(nombre);
    }

    public void eliminarContacto(T nombre) {
        contactos.eliminar(nombre);
    }
}