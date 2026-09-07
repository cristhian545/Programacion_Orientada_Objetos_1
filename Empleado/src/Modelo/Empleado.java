package Modelo;

public abstract class Empleado {
    private String nombre, apellido;
    private int edad, rut;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad, int rut) {
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

    @Override
    public String toString() {
        return "modelo.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", rut=" + rut +
                '}';
    }

    public void mostrarinfo(){
        System.out.println("Nombre del empleado:" + nombre);
        System.out.println("Apellido del empleado: " + apellido);
        System.out.println("Edad del empleado: " + edad);
        System.out.println("Rut del empleado: " + rut);

    }

}
