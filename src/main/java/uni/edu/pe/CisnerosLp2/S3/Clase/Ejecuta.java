package uni.edu.pe.CisnerosLp2.S3.Clase;

import java.util.ArrayList;

public class Ejecuta {
    static void main(String[] args) {
        ArrayList<UnidadEmergencia> unidades = new ArrayList<>();
        unidades.add(new Ambulancia(1, "Ambulancia Alfa", "EN_MISION", 3));
        unidades.add(new DronRescate(2, "Aguila 01", "DISPONIBLE",45));
        unidades.add(new UnidadBomberos(3, "Unidad Fenix", "EN_MISION",5000));

        for (int i = 0; i < unidades.toArray().length; i++){
            System.out.printf(unidades.get(i).ejecutarMision());
            System.out.println(" ");
        }

        Repositorio<UnidadEmergencia> unidades1 = new Repositorio<>();

        unidades1.guardar(new Ambulancia(1, "Ambulancia Alfa", "EN_MISION",3));
        unidades1.guardar(new DronRescate(2, "Aguila 01", "DISPONIBLE",45));
        unidades1.guardar(new UnidadBomberos(3, "Unidad Fenix", "EN_MISION",5000));

        System.out.println(unidades1.buscar(1).getEstado() + "---" + unidades1.buscar(1).getNombre());

        try{
            System.out.println(unidades1.buscar(67).getEstado());
        } catch (NoEncontradoException e) {
            System.out.println("");;
        }

        try {
            unidades1.guardar(new Ambulancia(1, "Ambulancia Alfa", "EN_MISION",3));
        } catch (DuplicadoException e) {
            System.out.println("");
        }

        CentralEmergencias centralPeru = new CentralEmergencias(unidades1);

        try {
            centralPeru.asignarMision(1);
        } catch (UnidadNoDisponibleException e){
            System.out.println("Unidad ya Ocupada");
        }

        System.out.println(unidades1.buscar(2).getEstado());



        centralPeru.asignarMision(2);
        System.out.println(unidades1.buscar(2).getEstado());
        centralPeru.finalizarMision(2);
        System.out.println(unidades1.buscar(2).getEstado());

    }
}
