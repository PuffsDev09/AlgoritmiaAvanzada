package uni.edu.pe.CisnerosLp2.S3.Clase;

public class Ambulancia extends UnidadEmergencia{

    private int cantidadParamedicos;

    public Ambulancia(int id, String nombre, String estado, int cantidadParamedicos) {
        super(id, nombre, estado);
        this.cantidadParamedicos = cantidadParamedicos;
    }

    public void setCantidadParamedicos(int cantidadParamedicos){
        this.cantidadParamedicos = cantidadParamedicos;
    }

    public int getCantidadParamedicos(){
        return this.cantidadParamedicos;
    }

    @Override
    public String ejecutarMision() {
        return "Atención y traslado médico";
    }
}
