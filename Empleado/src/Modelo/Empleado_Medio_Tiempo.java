package Modelo;

public class Empleado_Medio_Tiempo extends Empleado{
    int valorhora, horasTrabajadas;

    public Empleado_Medio_Tiempo() {
    }

    public Empleado_Medio_Tiempo(String nombre, String apellido, int edad, int rut) {
        super(nombre, apellido, edad, rut);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }


}
