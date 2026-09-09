import controlador.Biblioteca;
import Modelo.Libro;

void main() {

    Biblioteca b= new Biblioteca();
    int op=0;
    Scanner sc= new Scanner(System.in);
    Libro libro;

    do{
        System.out.println("Menú");
        System.out.println("1- Agregar Libro\n2-Listar\n3-Salir");

        try{
            op=sc.nextByte();
            sc.nextLine();
            switch(op){

                case 1:
                    System.out.println("Ingresa Titulo:");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese Autor:");
                    String autor = sc.nextLine();
                    System.out.println("Ingrese genero:");
                    String genero = sc.nextLine();
                    System.out.println("Ingresar Año de publicacion");
                    int anioPublicacion = sc.nextInt();


                    libro = new Libro(titulo, autor, genero, anioPublicacion);
                case 2:
                    b.listar();
                    break;


                case 3:
                    System.out.println("Chao vuelva pronto");
                    break;

            }

        }
        catch (Exception e) {
            System.out.println("Error: "+ e);
        }



    }while (op!=3);
}