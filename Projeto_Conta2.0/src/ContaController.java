import java.util.Optional;
import java.util.Scanner;

public class ContaController extends Conta
{

 public static void Criar()
 {
  Scanner s = new Scanner(System.in);
  ClienteDAO c = new ClienteDAO();

  System.out.println("Informe o cpf de um dos clientes abaixo para criar uma conta: ");
  c.listarClientes();
  int cpf = s.nextInt();

  Optional<Cliente> cliente = ClienteDAO.consultar(cpf);

  System.out.println("Informe o saldo inicial da conta: ");
  double saldo = s.nextDouble();

  Conta conta = new Conta(saldo);
  cliente.get().setConta(conta);
  System.out.println("Conta criada com sucesso !");
 }

 public static void Sacar()
 {
     Scanner s = new Scanner(System.in);
     ClienteDAO c = new ClienteDAO();

     System.out.println("Informe o cpf de um dos clientes abaixo para sacar: ");
     c.listarClientes();
     int cpf = s.nextInt();

     Optional<Cliente> cliente = ClienteDAO.consultar(cpf);
     System.out.println("Saldo disponível: " + cliente.get().getConta().getSaldo() + "\n");

     System.out.println("Informe o valor do saque: ");
     double val = s.nextDouble();

     cliente.get().getConta().sacar(val);
 }

 public static void Depositar()
 {
  Scanner s = new Scanner(System.in);
  ClienteDAO c = new ClienteDAO();

  System.out.println("Informe o cpf de um dos clientes abaixo para depositar: ");
  c.listarClientes();
  int cpf = s.nextInt();

  Optional<Cliente> cliente = ClienteDAO.consultar(cpf);

  System.out.println("Informe o valor do depósito: ");
  double val = s.nextDouble();

  cliente.get().getConta().depositar(val);
 }

 public static void VerificarSaldo()
 {
  Scanner s = new Scanner(System.in);
  ClienteDAO c = new ClienteDAO();

  System.out.println("Informe o cpf de um dos clientes abaixo para verificar o saldo: ");
  c.listarClientes();
  int cpf = s.nextInt();

  Optional<Cliente> cliente = ClienteDAO.consultar(cpf);

  System.out.println("Saldo: " + cliente.get().getConta().getSaldo());
 }

 public static void Transferir()
 {
  Scanner s = new Scanner(System.in);
  ClienteDAO c = new ClienteDAO();

  System.out.println("Informe o cpf de um dos clientes abaixo que irá transferir o dinheiro: ");
  c.listarClientes();
  int cpf1 = s.nextInt();

  Optional<Cliente> cliente1 = ClienteDAO.consultar(cpf1);

  System.out.println("Informe o cpf de um dos clientes abaixo que irá receber o dinheiro: ");
  c.listarClientes();
  int cpf2 = s.nextInt();

  Optional<Cliente> cliente2 = ClienteDAO.consultar(cpf2);

  System.out.println("Informe o valor a ser transferido: ");
  double valor = s.nextDouble();

  cliente1.get().getConta().transferir(cliente2.get().getConta(), valor);
 }
}
