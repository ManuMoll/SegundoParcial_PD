package ejercicio3;

public class SeguidorRegistrado implements IUsuario{
    private String preferencias;
    private Persona persona;

    public SeguidorRegistrado (String preferencias, Persona persona){
        this.preferencias = preferencias;
        this.persona = persona;
    }
    @Override
    public void update(String message, Publicacion publicacion) {
        System.out.println("Notificacion Recibida");
        System.out.println("Nombre usuario:"+ persona.getNombre());
        System.out.println(message);
        System.out.println(publicacion.getInformacion());
        System.out.println("La fecha de publicacion fue: "+publicacion.getFechaPublicacion());

    }

    @Override
    public String getPreferencias() {
        return preferencias;
    }
}
