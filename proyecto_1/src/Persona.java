public class Persona {

    private String rut;
    private String nom;
    private int edad;
    private boolean mayor;

    //Constructores{

    public Persona(String rut, String nom, int edad, boolean mayor) {
        this.rut = rut;
        this.nom = nom;
        this.edad = edad;
        this.mayor = mayor;
    }

    //Getters y Setters (Accesadores y modificadores)


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "rut='" + rut + '\'' +
                ", nom='" + nom + '\'' +
                ", edad=" + edad +
                ", mayor=" + mayor +
                '}';
    }
}

public boolean validaredad(){
        boolean valido= false;

        if valido >=18;