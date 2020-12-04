
public class Receita extends MovimentacaoFinanceira {
    private String cpf;
    private String formaRecebimento;
    private double imposto;

    public Receita(int dia, int mes, int ano, String horario, double valor, String cpf, String formaRecebimento){
        super(dia, mes, ano, horario, valor);
        this.cpf = cpf;
        this.formaRecebimento = formaRecebimento;
        imposto = 0.00;
    }
    
    public String getCpf(){
        return cpf;
    }

    @Override
    public double calcularImposto(){
        if(formaRecebimento.equals("Dinheiro")){
            imposto = (0.015*getValor()) + getTaxa();
        }
        else if(formaRecebimento.equals("Debito")){
            imposto =(0.03*getValor()) + getTaxa();
        }
        else if(formaRecebimento.equals("Credito")){
            imposto =(0.04*getValor()) + getTaxa();
        }
        return imposto;
     }
     
     @Override
     public String toString(){
        return "Receita recebida em: " + getDia() + "/" + getMes() + "/" + getAno() +  " " + getHorario()+ "\n"
        +"Valor : " + getValor()+ "\n" + "CPF : " + cpf + "\n" + "Forma de pagamento: " + formaRecebimento + "\n" +
        "Imposto a pagar: " + calcularImposto();
     }
}
