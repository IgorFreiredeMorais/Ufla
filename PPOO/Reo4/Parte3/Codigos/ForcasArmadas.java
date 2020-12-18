public class ForcasArmadas extends ListaDeBeneficiarios implements Interface {
    private double ultimoSalario;

    public ForcasArmadas(String cpf, String nome, double ultimoSalario){
        super(cpf,nome);
        this.ultimoSalario = ultimoSalario;
    }

    @Override
    public  double calcularAposentadoria(){
        double aposentadoria;
        aposentadoria = ultimoSalario * 0.9;
        return aposentadoria;
    }

    @Override
    public double calcularContribuicaoInss(){
        double contribuicao;
        contribuicao =  ultimoSalario * 0.11;
        return contribuicao;
    }
    
    @Override
    public String toString(){
        String cout = String.format("\nNome: %s\nCpf: %s\nAposentadoria: %.2f\nContribuicao INSS: %.2f",getNome(), getCpf(),calcularAposentadoria(),calcularContribuicaoInss());
        return cout;
    }
}
