import org.example.aplicacao.AppEstoque;
import org.example.entidades.Notebook;

public class AppEstoqueTeste extends AppEstoque{

    public static void main(String[]args) {
        Notebook n1 = new Notebook(455, "Teste1", "S1234");

        n1.incluirEstoque(12);
        n1.tirarEstoque(10);



    }
}
