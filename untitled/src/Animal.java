void main() {
    private class Animal {

        public String nom, raza;
        public int edad;


        public Animal() {
        }

        public Animal(String nom, String raza, int edad) {
            this.nom = nom;
            this.raza = raza;
            this.edad = edad;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public String toString() { return "Gato(" +
            return "Animal{" +
                    "nom='" + nom + '\'' +
                    ", raza='" + raza + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }

    public void imprimir() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

}