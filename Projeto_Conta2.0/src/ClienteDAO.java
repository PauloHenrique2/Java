import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteDAO
{
    public static List<Cliente> clientes = new ArrayList<>();

    public static void cadastrar(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public static Optional<Cliente> consultar(int cpf)
    {
        Optional<Cliente> cliente = clientes.stream().filter(c -> c.getCpf() == cpf).findFirst();
        return cliente;

    }

    public static void remover(Optional<Cliente> cliente)
    {
        clientes.remove(cliente.get());
    }

    public static void alterar(int cpf, String nome, String endereco)
    {
        Optional<Cliente> Cliente = consultar(cpf);
        Cliente.get().setNome(nome);
        Cliente.get().setEndereco(endereco);
        System.out.println("Dados do cliente atualizados!");
    }

    public void listarClientes()
    {
        for (int i = 0; i < clientes.size(); i++)
        {
            System.out.println("Nome: " + clientes.get(i).getNome());
            System.out.println("Cpf: " + clientes.get(i).getCpf());
            System.out.println("Endereço: " + clientes.get(i).getEndereco());
        }
    }
}
