public class IniciativaPrivada extends ListaDeBeneficiarios{
    private int percentualContribuicao;

    public IniciativaPrivada(String cpf, String nome, int percentualContribuicao){
        super(cpf,nome);
        this.percentualContribuicao = percentualContribuicao;
    }

    @Override
    public  double calcularAposentadoria(){
        double aposentadoria;
        aposentadoria = (percentualContribuicao * 5645.80) / 100;
        return aposentadoria;
    }

    @Override
    public String toString(){
        String cout = String.format("Nome: %s\nCpf: %s\nAposentadoria: %.2f",getNome(), getCpf(),calcularAposentadoria());
        return cout;
    }
}
