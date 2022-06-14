package ejercicio5;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args){

        IEstadoCompu state = new Prendido();
        Compu compu = new Compu();
        compu.setProgramas(new ArrayList<>());
        compu.setState(state);
        compu.request();

        state = new Apagado();
        compu.setState(state);
        compu.request();

        state = new Prendido();
        compu.setState(state);
        compu.request();

        state = new Reiniciar();
        compu.setState(state);
        compu.request();
    }
}