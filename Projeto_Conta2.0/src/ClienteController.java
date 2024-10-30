import java.util.Optional;
import java.util.Scanner;

public class ClienteController
{
    public static void Cadastrar()
    {
        Scanner s = new Scanner(System.in);
        ClienteDAO c = new ClienteDAO();

        System.out.println("Informe o nome: ");
        String nome = s.next();

        System.out.println("Informe o cpf: ");
        int cpf = s.nextInt();

        System.out.println("Informe o endereço: ");
        String endereco = s.next();

        Cliente cliente = new Cliente(nome, cpf, endereco);
        ClienteDAO.cadastrar(cliente);
    }

    public static void Consultar()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o cpf de um cliente a ser consultado: ");
        int cpf = s.nextInt();

        Optional<Cliente> cliente = ClienteDAO.consultar(cpf);

        if (cliente.isEmpty())
        {
            System.out.println("Cliente não encontrado!");
        }

        else
        {
            System.out.println("Nome: " + cliente.get().getNome() +
                               "\n Cpf: " + cliente.get().getCpf() +
                               "\n Endereço: " + cliente.get().getEndereco());
        }
    }

    public static void Remover()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o cpf de um dos clientes a ser removido: ");
        int cpf = s.nextInt();

        Optional<Cliente> cliente = ClienteDAO.consultar(cpf);
        ClienteDAO.remover(cliente);
    }

    public static void Alterar()
    {
        Scanner s = new Scanner(System.in);
        int opcaoCliente = 0;
        ClienteDAO c = new ClienteDAO();

        System.out.println("Insira o cpf de um dos clientes que deseja alterar: ");
        opcaoCliente = s.nextInt();

        System.out.println("Insira o novo nome: ");
        String NewNome = s.next();

        System.out.println("Insira o novo endereço: ");
        String NewEndereco = s.next();

        ClienteDAO.alterar(opcaoCliente, NewNome, NewEndereco);
    }
}