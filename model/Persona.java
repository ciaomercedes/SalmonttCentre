package model;
/**
 * Clase que representa a una Persona de la empresa Salmontt.
 * Incluye su informacion personal, domicilio {@link Direccion}
 * */

public class Persona {

    //Atributos privados
    private String nombre;
    private String apellido;
    private String rut;
    private int edad;
    private String correo;
    private String telefono;
    private String genero;
    private Direccion direccion; //se añade composición

    /**
     * Constructor que inicializa todos los campos de la persona empleada.
     * @param nombre    primer nombre de la  persona
     * @param apellido  primer apellido de la persona
     * @param rut       cedula de identidad o DNI
     * @param edad      edad
     * @param correo    correo electronico o e-mail
     * @param telefono  numero de contacto
     * @param genero    genero del empleado
     * @param direccion domicilio del empleado
     */

    public Persona(String nombre, String apellido, String rut, int edad, String correo,
                   String telefono, String genero, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.direccion = direccion;
    }

    //Getter y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve una representacion textual de la persona,
     * incluyendo su domicilio y datos empresa
     *
     * @return informacion completa del empleado
     */

    @Override
    public String toString(){
        return "Nombre: " + nombre + " " + apellido +
                "\nRUT: " + rut +
                "\nEdad: " + edad +
                "\nCorreo: " + correo +
                "\nTelefono: " + telefono +
                "\nGénero: " + genero +
                "\n" + direccion;
    }

}