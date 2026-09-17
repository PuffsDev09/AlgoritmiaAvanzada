package uni.edu.pe.CisnerosLp2.S3.Clase;

public class NoEncontradoException extends RuntimeException {
    public NoEncontradoException() {
        super("ID no encontrado");
    }
}
