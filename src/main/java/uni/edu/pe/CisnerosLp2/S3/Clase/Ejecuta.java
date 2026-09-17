package uni.edu.pe.CisnerosLp2.S3.Clase;

import java.util.ArrayList;

public class Ejecuta {
    static void main(String[] args) {
        ArrayList<UnidadEmergencia> unidades = new ArrayList<>();
        unidades.add(new Ambulancia());
        unidades.add(new DronRescate());
        unidades.add(new UnidadBomberos());

        for (int i = 0; i < unidades.toArray().length; i++){
            System.out.printf(unidades.get(i).ejecutarMision());
            System.out.println(" ");
        }

    }
}
