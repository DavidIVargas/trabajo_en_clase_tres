/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Agenda;
import vista.Vista;
import modelo.Contacto;

/**
 *
 * @author ESTUDIANTE
 */
public class Controlador {
    private Vista vista;
    private Agenda<String> agenda;

    public Controlador() {
        vista = new Vista();
        agenda = new Agenda<>();
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    String nombre = vista.pedirNombreContacto();
                    String telefono = vista.pedirTelefonoContacto();
                    agenda.agregarContacto(nombre, telefono);
                    vista.mostrarMensaje("Contacto agregado con éxito.");
                    break;
                case 2:
                    nombre = vista.pedirNombreContacto();
                    Contacto<String> contacto = agenda.buscarContacto(nombre);
                    if (contacto != null) {
                        vista.mostrarContacto(contacto);
                    } else {
                        vista.mostrarMensaje("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    nombre = vista.pedirNombreContacto();
                    agenda.eliminarContacto(nombre);
                    vista.mostrarMensaje("Contacto eliminado con éxito.");
                    break;
                case 4:
                    vista.mostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);

        vista.cerrarScanner();
    }
}