package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class AlmacenArchivos {
        private Map<String, Memento> stateSaved= new HashMap<>();
        public void createVersion(String numVersion, Memento memento){
            stateSaved.put(numVersion, memento);
        }
        public Memento getMemento(String numVersion){
            return stateSaved.get(numVersion);
        }
}
