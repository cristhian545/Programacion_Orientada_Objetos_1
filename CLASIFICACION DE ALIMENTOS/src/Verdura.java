public class Verdura extends Alimento {
    private String organicas, contenido_nutri;

    public Verdura() {
    }

    public Verdura(String nombre, String codigo, int precio_unit, int cantidad, String organicas, String contenido_nutri) {
        super(nombre, codigo, precio_unit, cantidad);
        this.organicas = organicas;
        this.contenido_nutri = contenido_nutri;
    }

    public String getOrganicas() {
        return organicas;
    }

    public void setOrganicas(String organicas) {
        this.organicas = organicas;
    }

    public String getContenido_nutri() {
        return contenido_nutri;
    }

    public void setContenido_nutri(String contenido_nutri) {
        this.contenido_nutri = contenido_nutri;
    }
}
