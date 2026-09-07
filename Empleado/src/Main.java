import Modelo.Empleado;
import Modelo.Empleado_Medio_Tiempo;
import Modelo.Empleado_Tiempo_Completo;


void main() {
    List<Empleado> listaEmpleado = new ArrayList<>();
    listaEmpleado.add(new Empleado_Medio_Tiempo("Juan", "Martinez", 18, 28145346-1));




    for (Empleado e: listaEmpleado){
        if (e instanceof Empleado_Medio_Tiempo){
            System.out.println(e.getNombre()+" Es empleado de medio tiempo");
        }else{

        }
    }
}