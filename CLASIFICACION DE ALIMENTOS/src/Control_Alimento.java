import java.sql.SQLOutput;
import java.util.ArrayList;

public class Control_Alimento {

    private ArrayList<Alimento> listaAlimentos;

    public void agregarAlimento(Alimento alimento){
        listaAlimentos.add(alimento);
        System.out.println("Alimento agregado correctamente");
    }

    public void listarAlimentos(){
        if (listaAlimentos.isEmpty()){
            System.out.println(">> No hay alimentos registrados");
        } else{
            System.out.println("===LISTADO DE ALIMENTOS");
            for (int i = 0; i < listaAlimentos.size(); i++){
                listaAlimentos.get(i).toString();
            }
        }
    }

    public void buscarAlimento(String codigo){
        boolean encontrado = false;

        for (int i = 0; i < listaAlimentos.size(); i++){
            if (listaAlimentos.get(i).getCodigo().equalsIgnoreCase(codigo){

            }

        }
    }
