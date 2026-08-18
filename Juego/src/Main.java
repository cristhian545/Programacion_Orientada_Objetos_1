import Model.Juego;
public static void main(String[] args) {
    String nombre, genero;
    int cantidad=0;
    Scanner entrada = new Scanner(System.in);
    Juego j1 = new Juego();

    System.out.println("Ingrese nombre del juego:");
    nombre = entrada.nextLine();
    System.out.println("Ingrese genero del juego:");
    genero= entrada.nextLine();

    j1.setNombre(nombre);
    j1.setGenero(genero);
    j1.setPrecio(80450);


    }

