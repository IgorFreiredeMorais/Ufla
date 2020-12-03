
public class Receita extends MovimentacaoFinanceira {
    private String cpf;
    private String formaRecebimento;

    public Receita(int dia, int mes, int ano, String horario, double valor, String cpf, String formaRecebimento) {
        super(dia, mes, ano, horario, valor);
        this.cpf = cpf;
        this.formaRecebimento = formaRecebimento;
    }
}
