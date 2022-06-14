package ejercicio1;

public class Client {
    public static void main(String[] args){
        AlmacenArchivos almacen = new AlmacenArchivos();
        GeneradorVersionArchivos generador = new GeneradorVersionArchivos();
        String archivo;
        archivo = "este documento es una prueba";
        generador.crearVersionamiento(archivo,almacen);
        archivo = "el exito solo depende de tu esfuerzo";
        generador.crearVersionamiento(archivo,almacen);
        archivo = "prologo";
        generador.crearVersionamiento(archivo,almacen);
        archivo = "este documento fue actualizado satisfactoriamente";
        generador.crearVersionamiento(archivo,almacen);
        generador.restoreFromMemento(almacen.getMemento("version1"));


    }
}
