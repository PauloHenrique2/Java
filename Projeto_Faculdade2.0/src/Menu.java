import java.util.Scanner;

public class Menu {
    private static Scanner s = new Scanner(System.in);

    private static int Menu() {
        System.out.println("Menu");
        System.out.println("----------------");
        System.out.println("1 - Gerenciar Alunos");
        System.out.println("2 - Gerenciar Disciplinas");
        System.out.println("3 - Gerenciar Cursos");
        System.out.println("4 - Sair");
        System.out.println("----------------");
        System.out.print("Opção: ");
        return s.nextInt();
    }

    public static void structMenu() {
        int opcaoMenu;

        do {
            opcaoMenu = Menu();
            if(opcaoMenu < 4)
                structSubMenu(opcaoMenu);
        } while(opcaoMenu != 4);
    }

    private static int subMenu(String valor) {
        System.out.println("Submenu " + valor);
        System.out.println("----------------");
        System.out.println("1 - Cadastrar " + valor);
        System.out.println("2 - Consultar " + valor);
        System.out.println("3 - Remover " + valor);
        System.out.println("4 - Atualizar " + valor);
        System.out.println("5 - Voltar ao menu inicial");
        System.out.println("----------------");
        System.out.print("Opção: ");
        return s.nextInt();
    }

    private static void structSubMenu(int opcao) {
        int opcaoSubMenu;
        String valorOpcao = "";

        if (opcao == 1)
            valorOpcao = "Aluno";

        else if (opcao == 2)
            valorOpcao = "Disciplina";

        else if (opcao == 3)
            valorOpcao = "Curso";

        do {
         opcaoSubMenu = subMenu(valorOpcao);

         if (opcaoSubMenu == 1 && valorOpcao == "Aluno")
          AlunoController.Cadastrar();

         else if (opcaoSubMenu == 2 && valorOpcao == "Aluno")
          AlunoController.Consultar();

         else if (opcaoSubMenu == 3 && valorOpcao == "Aluno")
          AlunoController.Remover();

         else if (opcaoSubMenu == 4 && valorOpcao == "Aluno")
          AlunoController.Alterar();

         else if (opcaoSubMenu == 1 && valorOpcao == "Disciplina")
          DisciplinaController.Cadastrar();

         else if (opcaoSubMenu == 2 && valorOpcao == "Disciplina")
          DisciplinaController.Consultar();

         else if (opcaoSubMenu == 3 && valorOpcao == "Disciplina")
          DisciplinaController.Remover();

         else if (opcaoSubMenu == 4 && valorOpcao == "Disciplina")
          DisciplinaController.Alterar();

         else if (opcaoSubMenu == 1 && valorOpcao == "Curso")
          CursoController.Cadastrar();

         else if (opcaoSubMenu == 2 && valorOpcao == "Curso")
             CursoController.Consultar();

         else if (opcaoSubMenu == 3 && valorOpcao == "Curso")
             CursoController.Remover();

         else if (opcaoSubMenu == 4 && valorOpcao == "Curso")
             CursoController.Alterar();

        } while (opcaoSubMenu != 5);
    }
}