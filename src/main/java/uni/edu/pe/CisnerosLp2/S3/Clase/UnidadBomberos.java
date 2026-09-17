package uni.edu.pe.CisnerosLp2.S3.Clase;

public class UnidadBomberos extends UnidadEmergencia{

    private int capacidadAgua;

    public int getCapacidadAgua() {
        return capacidadAgua;
    }

    public void setCapacidadAgua(int capacidadAgua) {
        this.capacidadAgua = capacidadAgua;
    }

    @Override
    public String ejecutarMision() {

        return "Control de Incendio y Rescate";
    }
}
