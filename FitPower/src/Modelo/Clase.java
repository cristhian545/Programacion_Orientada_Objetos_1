package Modelo;

public abstract class Clase {
    private String nombre;
    private int cupoMax, duracion;

    public Clase() {
    }

    public Clase(String nombre, int cupoMax, int duracion) {
        setNombre(nombre);
        setCupoMax(cupoMax);
        setDuracion(duracion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacio");
        }
        this.nombre = nombre;

    }

    public int getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(int cupoMax) {
        if(cupoMax < 1 || cupoMax > 30){
            throw new IllegalArgumentException("El cupo maximo debe estar entre 1 y 30");
        }
        this.cupoMax = cupoMax;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion < 0){
            throw new IllegalArgumentException("El valor debe ser mayor que cero");
        }
        this.duracion = duracion;


    }

    @Override
    public String toString() {
        return "Clase{" +
                "nombre='" + nombre + '\'' +
                ", cupoMax=" + cupoMax +
                '}';
    }
