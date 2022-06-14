package ejercicio3;

public class Persona {
    private String nombre;
    private String edad;

    public Persona(String nombre,String edad){
        this.edad =  edad;
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public String setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getEdad(){
        return edad;
    }
    public String setEdad(String nombre){
        this.edad = nombre;
    }
}
