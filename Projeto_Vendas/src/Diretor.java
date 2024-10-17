public class Diretor extends Gerente
{
    private String nome;

    public Diretor(String nome)
    {
       this.nome = nome;
    }

    public void vender() {
        super.vender();
    }

    public void imprimirComprovante() {
        super.imprimirComprovante();
    }

    public void cadastrarVendedor(Vendedor v) {
        super.cadastrarVendedor(v);
    }

    public void cadastrarProduto() {
        super.cadastrarProduto();
    }

    public void gerenciarFinanceiro()
    {
        System.out.println("Finanças em dia!");
    }

    public void emitirRelatorio(int tipo)
    {
     if (tipo == 7)
         System.out.println("-- Relatório genérico --");
     else if (tipo == 8)
         System.out.println("-- Relatório com filtro por produto --");
     else if (tipo == 9)
         System.out.println("-- Relatório com filtro por produto e cliente --");
     else if (tipo == 10)
         System.out.println("-- Relatório com filtro por produto, cliente e vendedor --");
     else
         System.out.println("Opção inválida! Selecione um número válido.");
    }
}
