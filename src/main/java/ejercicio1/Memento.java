package ejercicio1;

public class Memento {
    private String state;
    public Memento(String stateSaved){
        this.state = stateSaved;
    }
    public String getState(){
        return state;
    }
}
