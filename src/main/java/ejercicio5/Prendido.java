package ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class Prendido implements IEstadoCompu{
    @Override
    public void handler(Compu computadora) {
        System.out.println("El estado es Prendido");
        int num = (int)(Math.random()*20+1);
        computadora.setUsoCpu(0);
        List<String> programasAbiertos= new ArrayList<>();
        int usoCpu=0;
        int contadorProgramas=1;
        for(int i=1; i<=num; i++){
            programasAbiertos.add("Programa"+contadorProgramas);
            System.out.print("Programa"+contadorProgramas+" ");
            contadorProgramas++;
            usoCpu= usoCpu+5;
        }
        System.out.println();
        computadora.setProgramas(programasAbiertos);
        computadora.setUsoCpu(usoCpu);
        System.out.println("Se tienen abiertos: "+computadora.getProgramas().size()+" programas.");
        System.out.println("El consumo de cpu es: "+computadora.getUsoCpu()+" %");




    }
}