public class Fruta extends Alimento {
    private String pais_ori, temporada_culti;

    public Fruta() {
    }

    public Fruta(String nombre, String codigo, int precio_unit, int cantidad, String pais_ori, String temporada_culti) {
        super(nombre, codigo, precio_unit, cantidad);
        this.pais_ori = pais_ori;
        this.temporada_culti = temporada_culti;
    }

    public String getPais() {
        return pais_ori;
    }

    public void setPais(String pais) {
        this.pais_ori = pais;
    }

    public String getTemporada_culti() {
        return temporada_culti;
    }

    public void setTemporada_culti(String temporada_culti) {
        this.temporada_culti = temporada_culti;
    }

    @Override
    public String toString() {
        System.out.println("\nPais origen:" + pais_ori + "\nTemporada cultivo:" + temporada_culti);
        return super.toString();
    }

    @Override
    public double calcularPrecioFinal() {
        // Añade aquí tu lógica para calcular el precio
        return 0.0;
    }
}