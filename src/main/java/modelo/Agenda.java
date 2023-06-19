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

    private ListaEnlazada<Contacto<T>> contactos;

    public Agenda() {
        contactos = new ListaEnlazada<>();
    }

    public void agregarContacto(T nombre, T telefono) {
        Contacto<T> contacto = new Contacto<>(nombre, telefono);
        contactos.agregar(contacto);
    }

    public Contacto<T> buscarContacto(T nombre) {
        Nodo<Contacto<T>> nodoActual = contactos.getPrimero();
        while (nodoActual != null) {
            Contacto<T> contacto = nodoActual.getDato();
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return null;
    }

    public void eliminarContacto(T nombre) {
        contactos.eliminar(new Contacto<T>(nombre, null));
    }

}
