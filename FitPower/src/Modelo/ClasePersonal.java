package Modelo;

public class ClasePersonal extends Clase implements Cancelable {
    private static final double Base = 35000;
    private static final double Recargo = 0.20;
    private String instructor;
    private boolean evaluacionPrevia;
    private boolean cancelacionActiva;

    public ClasePersonal(String nombre, int cupoMax, int duracion, String instructor, boolean evaluacionPrevia, boolean cancelacionActiva) {
        super(nombre, cupoMax, duracion);
        this.instructor = instructor;
        this.evaluacionPrevia = evaluacionPrevia;
        this.cancelacionActiva = false;
    }

}
