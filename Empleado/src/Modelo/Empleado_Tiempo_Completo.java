package Modelo;

public class Empleado_Tiempo_Completo {
    private String nombre, apellido;
    private int edad, rut;

    public Empleado_Tiempo_Completo() {
    }

    public Empleado_Tiempo_Completo(String nombre, String apellido, int edad, int rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void mostrarInfo(){
        System.out.println("Rut: "+ rut);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Edad: "+ edad);


    }
}
