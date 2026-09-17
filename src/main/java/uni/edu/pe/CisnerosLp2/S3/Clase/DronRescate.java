package uni.edu.pe.CisnerosLp2.S3.Clase;

public class DronRescate extends UnidadEmergencia{

    private int autonomiaMinutos;

    public int getAutonomiaMinutos() {
        return autonomiaMinutos;
    }

    public void setAutonomiaMinutos(int autonomiaMinutos) {
        this.autonomiaMinutos = autonomiaMinutos;
    }

    @Override
    public String ejecutarMision() {
        return "Reconocimiento Aéreo";
    }
}
