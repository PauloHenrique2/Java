import java.util.ArrayList;
import java.util.List;

public class Gerente extends Vendedor
{
    private String nome;

    private List<Vendedor> vendedoresGerenciados = new ArrayList<>();

    public Gerente()
    {}

    public Gerente(String nome)
    {
        this.nome = nome;
    }

    public void vender() {
        super.vender();
    }

    public void imprimirComprovante() {
        super.imprimirComprovante();
    }

    public void cadastrarVendedor(Vendedor v)
    {
     vendedoresGerenciados.add(v);
     System.out.println("Vendedor: " + v.getNome() + " cadastrado!");
    }

    public void cadastrarProduto()
    {
        System.out.println("Produto cadastrado!");
    }
}
