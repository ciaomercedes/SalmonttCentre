package app;

import model.Empleado;
import model.Direccion;
import model.Persona;

/**
 * Clase principal del programa de Salmontt. Orquesta todas las clases de los paquetes.
 * Permite crear instancias de Persona, Empleado y Direcciob para luego mostrar su informacion como empleado.
 */

public class Main {

    public static void main(String[] args) {

        //Creación de las direcciones
        Direccion dir1 = new Direccion("Av. Antonio Varas", 123, "Puerto Montt", "Los Lagos");
        Direccion dir2 = new Direccion("Av. Arturo Pratt", 543, "Calbuco", "Los Lagos");
        Direccion dir3 = new Direccion("Av. Andrés Bello", 7788, "Puerto Varas", "Los Lagos");

        //Creación de empleados y personas por herencia con nomenclatura numérica
        Persona persona1 = new Persona("Michael", "Jackson", "15448123-K", 35,
                "mj35@yahoo.com", "+56955555555", "Masculino", dir1);
        Empleado empleado1 = new Empleado(persona1.getNombre(), persona1.getApellido(), persona1.getRut(),
                persona1.getEdad(), persona1.getCorreo(), persona1.getTelefono(), persona1.getGenero(), dir1,
                "Contador", "26-02-2021", 1050000.0);

        Persona persona2 = new Persona("Leonardo", "Da Vinci", "11433222-1", 48,
                "el_giocondo64@gmail.com", "+56933333333", "Masculino", dir2);
        Empleado empleado2 = new Empleado(persona2.getNombre(), persona2.getApellido(), persona2.getRut(),
                persona2.getEdad(), persona2.getCorreo(), persona2.getTelefono(), persona2.getGenero(), dir2,
                "Supervisor de Planta", "15-10-2022", 1650000.0);

        Persona persona3 = new Persona("Bulma", "Brief", "18394567-2", 33,
                "dra.Brief87@capsulecorp.com", "+56984998761", "Femenino", dir3);
        Empleado empleado3 = new Empleado(persona3.getNombre(), persona3.getApellido(), persona3.getRut(),
                persona3.getEdad(), persona3.getCorreo(), persona2.getTelefono(), persona3.getGenero(), dir3,
                "Ingeniero Químico", "04-12-2024", 2350000.0);


        //Imprimir la informacion de los empleados
        System.out.println(">>>>> Listado de trabajadores 'Salmontt' <<<<<");
        System.out.println(empleado1);
        System.out.println("----------------------------------------------");
        System.out.println(empleado2);
        System.out.println("----------------------------------------------");
        System.out.println(empleado3);
        System.out.println("----------------------------------------------");
    }
}