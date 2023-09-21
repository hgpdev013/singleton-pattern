public class Fila {
    private static Fila instance;
    private Fila(){

    }
    public void ImprimeFila() {
        System.out.println("Imprimindo a fila");
    }

    public void RemoveDocumento() {
        System.out.println("Removendo um documento da fila");
    }

    public void RemoveTodosDocumentos() {
        System.out.println("Removendo todos os documentos da fila");
    }

    public static Fila getInstance(){
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }
}
