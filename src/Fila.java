public class Fila {
    private static Fila instance;
    private Fila(){

    }
    private void ImprimeDocumento(){

    }
    private void RemoveDocumento(){

    }
    private void RemoveTodosDocumentos(){

    }

    public static Fila getInstance(){
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }
}
