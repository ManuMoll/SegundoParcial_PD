package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PagWeb implements IPagweb{

    private List<IUsuario> usuarioList = new ArrayList<>();
    private List<Publicacion> publicaciones = new ArrayList<>();

    public void agregarPublicacion(Publicacion publicacion){
        publicaciones.add(publicacion);
        this.notifyObserver(publicacion);
    }

    @Override
    public void attach(IUsuario usuario) {
        usuarioList.add(usuario);
    }

    @Override
    public void deattach(IUsuario usuario) {
            usuarioList.remove(usuario);
    }

    @Override
    public void notifyObserver(Publicacion publicacion) {
        for (IUsuario usuario: usuarioList){
            if (usuario.getPreferencias().contains(publicacion.getTipo())){
                usuario.update("Nueva publicacion de tipo: "+ publicacion.getTipo(),publicacion);
            }
        }

    }
}
