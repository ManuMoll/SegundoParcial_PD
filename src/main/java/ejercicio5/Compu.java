package ejercicio5;

import java.util.List;

public class Compu {
    private IEstadoCompu state;
    private List<String> programas;
    private int usoCpu;
    private int usoMemoriaRAM;

    public Compu(){}
    public void request(){
        this.state.handler(this);
    }

    public IEstadoCompu getState() {
        return state;
    }

    public void setState(IEstadoCompu state) {
        this.state = state;
    }

    public List<String> getProgramas() {
        return programas;
    }

    public void setProgramas(List<String> programas) {
        this.programas = programas;
    }

    public int getUsoCpu() {
        return usoCpu;
    }

    public void setUsoCpu(int usoCpu) {
        this.usoCpu = usoCpu;
    }

    public int getUsoMemoriaRAM() {
        return usoMemoriaRAM;
    }

    public void setUsoMemoriaRAM(int usoMemoriaRAM) {
        this.usoMemoriaRAM = usoMemoriaRAM;
    }
}
