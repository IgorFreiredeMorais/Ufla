
package carrinhoteste;

public class Acoes extends Investimentos {
    private double precoInicio;
    private double precoFinal;
    
    
    
    public Acoes(double valor, int mes, double precoInicio, double precoFinal){
        super(valor, mes);
        this.precoFinal = precoFinal;
        this.precoInicio = precoInicio;
        
    }
   
    public double getPrecoFinal(){
        return precoFinal;
    }
    public double getPrecoInicio(){
        return precoInicio;
    }
    
     public double rendimentoAcao(){
        double rendimentoA;
        double valorF;
        rendimentoA = (getPrecoFinal()/getPrecoInicio()) * 100 - 100;
        valorF = getValor()*Math.pow((1+rendimentoA/100),getMes());
        return valorF;
    }
}
