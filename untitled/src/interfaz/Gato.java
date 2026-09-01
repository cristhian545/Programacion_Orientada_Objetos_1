package interfaz;

public final class Gato extends Animal  {
    public String vacunas;

    public Gato() {
    }

    public Gato(String vacunas) {
        this.vacunas = vacunas;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }


}

