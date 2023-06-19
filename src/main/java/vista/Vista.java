/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Contacto;

/**
 *
 * @author ESTUDIANTE
 */
public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("---- Agenda ----");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public String pedirNombreContacto() {
        System.out.print("Ingrese el nombre del contacto: ");
        return scanner.next();
    }

    public String pedirTelefonoContacto() {
        System.out.print("Ingrese el número de teléfono: ");
        return scanner.next();
    }

    public void mostrarContacto(Contacto<String> contacto) {
        System.out.println("Contacto encontrado:");
        System.out.println("Nombre: " + contacto.getNombre());
        System.out.println("Teléfono: " + contacto.getTelefono());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}