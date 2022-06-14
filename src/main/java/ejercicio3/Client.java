package ejercicio3;

public class Client {
    public static void main (String[] args) {
        PagWeb pagWeb = new PagWeb();

        SeguidorRegistrado seguidor1 = new SeguidorRegistrado("Videos, Noticias", new Persona("JuanPerez", "17 anios"));
        SeguidorRegistrado seguidor2 = new SeguidorRegistrado("Noticias", new Persona("Julian", "27 anios"));
        SeguidorRegistrado seguidor3 = new SeguidorRegistrado("Noticias y  videos", new Persona("Ian", "32 anios"));
        SeguidorRegistrado seguidor4 = new SeguidorRegistrado("Videos", new Persona("Mateo", "15 anios"));
        SeguidorRegistrado seguidor5 = new SeguidorRegistrado(" Noticias", new Persona("Yanco", "23 anios"));

        pagWeb.attach(seguidor1);
        pagWeb.attach(seguidor2);
        pagWeb.attach(seguidor3);
        pagWeb.attach(seguidor4);
        pagWeb.attach(seguidor5);

        pagWeb.agregarPublicacion(new Publicacion("13/06/2022","Videos","video de analisis final de futbol boliviano"));
        pagWeb.agregarPublicacion(new Publicacion("10/06/2022","Noticias", "Noticia acerca de los casos de Covid en Bolivia" ));
        pagWeb.agregarPublicacion(new Publicacion("12/06/2022", "Fotos", "Fotos de la amazonia" ));

    }
}
