import org.example.aplicacao.AppEstoque;
import org.example.entidades.Produto;
import org.example.entidades.Toner;

public class AppEstoqueTeste2 extends AppEstoque {

    public static void main(String[] args) {

        Produto t[] = new Produto[4];

        t[0] = new Toner(1234, "t1234", "M4567", "Ciano", "Color");
        t[1] = new Toner(1111,"t9876","M9876", "Magenta", "Color");
        t[2] = new Toner(1111,"t9876","M9876", "Magenta", "Color");
        t[3] = new Toner(1111,"t9876","M9876", "Magenta", "Color");

        t[1].incluirEstoque(2);
        t[1].incluirEstoque(2);
        t[1].incluirEstoque(10);
        t[1].tirarEstoque(2);

        t[1].consultarEstoque();

    }
}