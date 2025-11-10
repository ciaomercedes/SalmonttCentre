package model;

/**
 * Clase que representa a un empelado de la empresa Salmontt.
 * Incluye su información laboral respectica de la empresa y recibe por herencia atributos personales
 * */

public class Empleado extends Persona { //Para heredar los atributos de la clase Persona

    //Atributos privados
    private String cargo;
    private String fechaContratacion;
    private double sueldo;

    /**
     * Constructor que inicializa todos los campos del Empelado.
     * @param cargo             posición dentro de la empresa
     * @param fechaContratacion fecha firma de contratacion
     * @param sueldo            remuneracion asignada
     */

    public Empleado(String nombre, String apellido, String rut, int edad, String correo, String telefono,
                    String genero, Direccion direccion, String cargo, String fechaContratacion, double sueldo) {
        super(nombre, apellido, rut, edad, correo, telefono, genero, direccion);
        this.cargo = cargo;
        this.fechaContratacion = fechaContratacion;
        this.sueldo = sueldo;
    }

    //getter y setter

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Devuelve una representacion textual del empleado,
     * @return información completa del empleado heredando atributos de Persona.
     */

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: " + cargo +
                "\nFecha Contratacion: " + fechaContratacion +
                "\nSueldo: $" + sueldo;
    }
}