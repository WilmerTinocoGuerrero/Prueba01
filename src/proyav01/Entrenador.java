/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyav01;

/**
 *
 * @author Usuario
 */
public class Entrenador {

    private String nombre;
    private String especialidad;

    // Constructor
    public Entrenador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre del entrenador: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }

    public static void main(String[] args) {
        // Crear un objeto de tipo Entrenador
        Entrenador entrenador = new Entrenador("Juan Pérez", "Fútbol");
        
        // Mostrar información del entrenador
        entrenador.mostrarInformacion();
    }
}