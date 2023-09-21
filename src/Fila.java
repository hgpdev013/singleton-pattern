public class Fila {
    private static Fila instance;
    private Fila(){

    }
    public void ImprimeFila() {
    }

    public void RemoveDocumento() {
    }

    public void RemoveTodosDocumentos() {
    }

    public static Fila getInstance(){
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }
}
