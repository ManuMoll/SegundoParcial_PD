package ejercicio5;
import java.util.ArrayList;

public class Reiniciar implements IEstadoCompu{
    @Override
    public void handler(Compu computadora) {
        System.out.println("Entra en un estado de reiniciado");
        computadora.setUsoCpu(5);
        computadora.setUsoMemoriaRAM(10);
        computadora.setProgramas(new ArrayList<>());
        System.out.println("Todos los programas estan cerrados: "+computadora.getProgramas().size());
        System.out.println("El uso de la memoria ram esra al minimo: "+computadora.getUsoMemoriaRAM()+" %");
        System.out.println("El uso de la cpu esta al minimo: "+computadora.getUsoCpu()+" %");

    }
}