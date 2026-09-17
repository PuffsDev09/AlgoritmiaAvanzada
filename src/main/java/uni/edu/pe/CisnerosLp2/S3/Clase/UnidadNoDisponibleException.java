package uni.edu.pe.CisnerosLp2.S3.Clase;

public class UnidadNoDisponibleException extends RuntimeException {
    public UnidadNoDisponibleException() {
        super("Unidad ya Ocupada. Solicite otra unidad");
    }
}
