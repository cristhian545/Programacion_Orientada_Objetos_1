import java.util.Scanner;


public class Main(String[] args) {

  Scanner sc = new Scanner(System.in);
  Control_Alimento control = new Control_Alimento();
  int op;

  do{
    System.out.println("===Menu Gestor de Alimentos ===");
    System.out.println("Seleccionar una opcion");
    System.out.println("1.Agregar alimento");
    System.out.println("2.Listar Alimentos");
    System.out.println("3.Buscar Alimentos");
    System.out.println("4.Salir");
    op = sc.nextInt();
    sc.nextLine();

    switch (op){
      case 1:
        System.out.println("Que deseas registrar?");
        System.out.println("1. Fruta");
        System.out.println("2. Verdura");
        op = sc.nextInt();
        sc.nextLine();

        switch (op){
          case 1:
              String codAlimento = Validador.validarCodigo(sc);


        }
    }
  }

}