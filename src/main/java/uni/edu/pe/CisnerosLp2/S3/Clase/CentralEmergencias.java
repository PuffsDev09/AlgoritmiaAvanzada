package uni.edu.pe.CisnerosLp2.S3.Clase;

public class CentralEmergencias {
    private Repositorio<UnidadEmergencia> listaUnidades = new Repositorio();

    public void asignarMision(int id){
        UnidadEmergencia solicitado = listaUnidades.buscar(id);
        if(solicitado.getEstado() == "DISPONIBLE") {
            solicitado.setEstado("EN_MISION");
        } else {
            throw new UnidadNoDisponibleException();
        }
    }


}
