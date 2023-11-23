package questao03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Persistencia persistencia = new Persistencia();
        PersistenciaJSON persistenciaJSON = new PersistenciaJSON(persistencia);

        try {
            persistenciaJSON.salvar("{\"nome\":\"João\",\"idade\":30}", "arquivo.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
