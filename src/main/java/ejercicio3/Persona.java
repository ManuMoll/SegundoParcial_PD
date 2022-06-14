package ejercicio3;

public class Persona {
    private String nombre;
    private String edad;

    public Persona(String nombre,String edad){
        this.nombre = nombre;
        this.edad =  edad;
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
    public String setEdad(String edad){
        this.edad = edad;
    }
}
