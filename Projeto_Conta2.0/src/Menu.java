import java.util.Scanner;

public class Menu
{
    private static Scanner s = new Scanner(System.in);

        private static int Menu()
        {
            System.out.println("Menu");
            System.out.println("----------------");
            System.out.println("1 - Gerenciar Clientes");
            System.out.println("2 - Gerenciar Contas");
            System.out.println("3 - Sair");
            System.out.println("----------------");
            System.out.print("Opção: ");
            return s.nextInt();
        }

        public static void structMenu()
        {
            int opcaoMenu;

            do
            {
                opcaoMenu = Menu();
                if (opcaoMenu == 1)
                    structSubMenuCliente(opcaoMenu);
                else if (opcaoMenu == 2)
                    structSubMenuConta(opcaoMenu);
            } while(opcaoMenu != 3);
        }

        private static int subMenuCliente()
        {
            System.out.println("Submenu Cliente");
            System.out.println("----------------");
            System.out.println("1 - Cadastrar Cliente" );
            System.out.println("2 - Consultar Cliente");
            System.out.println("3 - Remover Cliente");
            System.out.println("4 - Atualizar Cliente");
            System.out.println("5 - Voltar ao menu inicial");
            System.out.println("----------------");
            System.out.print("Opção: ");
            return s.nextInt();
        }

        private static void structSubMenuCliente(int opcao)
        {
            int opcaoSubMenu;

            do
            {
                opcaoSubMenu = subMenuCliente();

                if (opcaoSubMenu == 1)
                    ClienteController.Cadastrar();

                else if (opcaoSubMenu == 2)
                    ClienteController.Consultar();

                else if (opcaoSubMenu == 3)
                    ClienteController.Remover();

                else if (opcaoSubMenu == 4)
                    ClienteController.Alterar();

            } while (opcaoSubMenu != 5);
        }

        private static int subMenuConta()
        {
           System.out.println("Submenu Conta");
           System.out.println("----------------");
           System.out.println("1 - Criar Conta para um Cliente" );
           System.out.println("2 - Sacar dinheiro de uma Conta de um Cliente");
           System.out.println("3 - Depositar dinheiro para uma Conta de um Cliente");
           System.out.println("4 - Verificar saldo de uma Conta de um Cliente");
           System.out.println("5 - Transferir dinheiro de uma Conta de um Cliente para outro Cliente");
           System.out.println("6 - Voltar ao menu inicial");
           System.out.println("----------------");
           System.out.print("Opção: ");
           return s.nextInt();
        }

        private static void structSubMenuConta(int opcao)
        {
            int opcaoSubMenu;

            do
            {
                opcaoSubMenu = subMenuConta();

                if (opcaoSubMenu == 1)
                    ContaController.Criar();

                else if (opcaoSubMenu == 2)
                    ContaController.Sacar();

                else if (opcaoSubMenu == 3)
                    ContaController.Depositar();

                else if (opcaoSubMenu == 4)
                    ContaController.VerificarSaldo();

                else if (opcaoSubMenu == 5)
                    ContaController.Transferir();
            } while (opcaoSubMenu != 6);
        }
}
