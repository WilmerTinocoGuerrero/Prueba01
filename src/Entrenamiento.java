/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Entrenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    private String tipo;
    private int duracion; // En minutos
    private String intensidad;
    private double caloriasQuemadas;

    // Constructor
    public Entrenamiento(String tipo, int duracion, String intensidad, double caloriasQuemadas) {
        this.tipo = tipo;
        this.duracion = duracion;
        this.intensidad = intensidad;
        this.caloriasQuemadas = caloriasQuemadas;
    }

    // Métodos getter y setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    public double getCaloriasQuemadas() {
        return caloriasQuemadas;
    }

    public void setCaloriasQuemadas(double caloriasQuemadas) {
        this.caloriasQuemadas = caloriasQuemadas;
    }

    // Método para mostrar detalles del entrenamiento
    public void mostrarDetalles() {
        System.out.println("Tipo de Entrenamiento: " + tipo);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Intensidad: " + intensidad);
        System.out.println("Calorías Quemadas: " + caloriasQuemadas);
    }
}
