package carrinhoteste;
public class Despesa {
    private String cnpj;
    private int numeroParcelas;
    private double imposto;

    public Despesa(int dia, int mes, int ano, String horario, double valor, String cnpj, int numeroParcelas){
        super(dia, mes, ano, horario, valor);
        this.cnpj = cnpj;
        this.numeroParcelas = numeroParcelas;
        imposto 0.00;
    }

    public String getCnpj(){
        return cnpj;
    }
    @Override
    public double calcularImposto(){
        imposto = (0.01*numeroParcelas) + getTaxa();
        return imposto;
     }

    @Override
     public String toString(){
        return "despesa realizada em:" + getDia + "/" + getMes + "/" + getAno +  " " + getHorario /n
        + "Valor:" + getValor()/n + "CNPJ:" + cnpj + "Numero de parcelas:" + numeroParcelas /n +
        "Imposto a pagar" + imposto;
     }
}
