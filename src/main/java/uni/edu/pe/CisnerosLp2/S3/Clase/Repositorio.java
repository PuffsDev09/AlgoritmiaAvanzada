package uni.edu.pe.CisnerosLp2.S3.Clase;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Repositorio<T extends Identificable> {
    private HashMap<Integer, T> listaUnidades = new HashMap<>();

    public void guardar(T elemento){
        if(listaUnidades.containsKey(elemento.id())) {
            System.out.println("La lista ya incluye este ID");
            throw new DuplicadoException();
        } else {
            this.listaUnidades.put(elemento.id(), elemento);
        }
    }

    public T buscar(int id){
        if(!listaUnidades.containsKey(id)){
            System.out.println("La unidad con el ID mencionado no existe");
            throw new NoEncontradoException();
        } else {
            return listaUnidades.get(id);
        }
    }

    public void eliminar(int id){
        if(listaUnidades.containsKey(id)){
            listaUnidades.remove(id);
        } else {
            System.out.println("Unidad no registrada");
            throw new NoEncontradoException();
        }
    }

    public Collection<T> listar(){
        return Collections.unmodifiableCollection(listaUnidades.values());
    }

}
