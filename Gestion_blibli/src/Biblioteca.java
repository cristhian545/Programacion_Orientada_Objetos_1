import Modelo.Libro;
void main() {
    System.out.println("Gestion de libros");
    System.out.println("lA LIBRERIA DON");

    Libro L1 = new Libro("El principito", "Julio iglesias", "Pov", 1955);
    Libro L2 = new Libro("Game", "Rockstar", "Porno", 2026);
    Libro L3 = new Libro("EL ESTIMADO EDUARDO", "Tristan thompson", "DOWN", 2015);

    L1.mostrarinfo();
    L2.mostrarinfo();
}