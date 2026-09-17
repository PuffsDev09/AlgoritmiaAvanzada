package uni.edu.pe.CisnerosLp2.S3.Clase;

public class UnidadEmergencia implements Operable, Identificable{
    private int id;
    private String nombre;
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {

        if(this.estado != "DISPONIBLE" && this.estado != "EN_MISION"){
            return;
        }
        else {
            this.estado = estado;
        }
    }

    @Override
    public void iniciarMision() {
        System.out.println("Iniciando Mision");
    }

    @Override
    public void finalizarMision() {
        System.out.println("Finalizando Mision");
    }

    @Override
    public String ejecutarMision() {
        return "En Proceso";
    }

    @Override
    public int id() {
        return this.id;
    }
}
