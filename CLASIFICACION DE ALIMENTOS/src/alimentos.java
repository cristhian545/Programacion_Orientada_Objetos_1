public class alimentos {
    private String nombre, codigo;
    private int precio_unit,cantidad;

    public alimentos() {
    }

    public alimentos(String nombre, String codigo, int precio_unit, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio_unit = precio_unit;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(int precio_unit) {
        this.precio_unit = precio_unit;
    }

    @Override
    public String toString() {
        return "alimentos{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precio_unit=" + precio_unit +
                ", cantidad=" + cantidad +
                '}';
    }
}
