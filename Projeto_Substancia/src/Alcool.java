public class Alcool extends SubstanciaPura
{
    private double pontoFusao;

    private double pontoEbulicao;

    public void SetPontoFusao(double temp)
    {
        this.pontoFusao = temp;
    }

    public void SetPontoEbulicao(double temp)
    {
        this.pontoEbulicao = temp;
    }

    public void entrarPontoDeEbulicao(double temperatura)
    {
        if(temperatura == 78.4)
            SetPontoEbulicao(temperatura);
        else
            System.out.println("Temperatura inválida!");
    }

    public void entrarPontoDeFusao(double temperatura)
    {
        if (temperatura == 0)
            SetPontoFusao(temperatura);
        else
            System.out.println("Temperatura inválida!");
    }
}
