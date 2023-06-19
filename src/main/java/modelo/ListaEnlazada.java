/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTE
 */
class ListaEnlazada<T> {
    private Nodo<T> cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> nodoActual = cabeza;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
    }

    public T buscar(T nombre) {
        Nodo<T> nodoActual = cabeza;
        while (nodoActual != null) {
            Contacto<T> contacto = (Contacto<T>) nodoActual.getDato();
            if (contacto.getNombre().equals(nombre)) {
                return nodoActual.getDato();
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return null;
    }

    public void eliminar(T nombre) {
        if (cabeza == null) {
            return;
        }

        if (((Contacto<T>) cabeza.getDato()).getNombre().equals(nombre)) {
            cabeza = cabeza.getSiguiente();
            return;
        }

        Nodo<T> nodoActual = cabeza;
        while (nodoActual.getSiguiente() != null) {
            Contacto<T> contacto = (Contacto<T>) nodoActual.getSiguiente().getDato();
            if (contacto.getNombre().equals(nombre)) {
                nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
                return;
            }
            nodoActual = nodoActual.getSiguiente();
        }
    }
}