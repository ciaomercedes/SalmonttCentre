package model;

/**
 * Clase que representa la dirección fisica de un empleado.
 * Contiene información detallada como la calle, número, ciudad y país.
 */

public class Direccion {

    //Atributos privados
    private String calle;
    private int numero;
    private String ciudad;
    private String region;

    /**
     * Constructor que inicializa todos los campos de la direccion.
     *
     * @param calle  nombre de la calle
     * @param numero numero de la direccion
     * @param ciudad ciudad de residencia
     * @param region region de residencia
     */

    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    //Getters y Setters

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Devuelve una linea en texto de la direccion.
     *
     * @return direccion completa como String
     */
    @Override
    public String toString() {
        return "Vive en " + calle + " " + numero + ", " + ciudad + ", " + region;
    }
}