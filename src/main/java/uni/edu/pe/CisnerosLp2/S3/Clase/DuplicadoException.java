package uni.edu.pe.CisnerosLp2.S3.Clase;

public class DuplicadoException extends RuntimeException {
    public DuplicadoException() {
        super("ID ya usado");
    }
}
