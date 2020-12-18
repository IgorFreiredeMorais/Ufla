public class ServicoPublico  extends ListaDeBeneficiarios implements Interface{
    private double mediaSalarial;

    public ServicoPublico(String cpf, String nome, Double mediaSalarial){
        super(cpf,nome);
        this.mediaSalarial = mediaSalarial;
    }

    @Override
    public  double calcularAposentadoria(){
        double aposentadoria;
        aposentadoria = mediaSalarial * 0.8;
        return aposentadoria;
    }

    @Override
    public double calcularContribuicaoInss(){
        double contribuicao;
        contribuicao =  mediaSalarial * 0.14;
        return contribuicao;
    }

    @Override
    public String toString(){
        String cout = String.format("\nNome: %s\nCpf: %s\nAposentadoria: %.2f\nContribuicao INSS: %.2f",getNome(), getCpf(),calcularAposentadoria(),calcularContribuicaoInss());
        return cout;
    }
}
