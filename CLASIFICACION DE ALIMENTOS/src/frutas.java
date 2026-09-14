public class frutas extends alimentos{
    private String pais, temporada_culti;

    public frutas() {
    }

    public frutas(String nombre, String codigo, int precio_unit, int cantidad, String pais, String temporada_culti) {
        super(nombre, codigo, precio_unit, cantidad);
        this.pais = pais;
        this.temporada_culti = temporada_culti;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTemporada_culti() {
        return temporada_culti;
    }

    public void setTemporada_culti(String temporada_culti) {
        this.temporada_culti = temporada_culti;
    }
}
