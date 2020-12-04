
package carrinhoteste;

public class Poupanca extends Investimentos {
    private double taxaSelic;
    private double taxaTR;
    
    
    public Poupanca(double valor,int mes,  double taxaSelic, double taxaTR){
        super(valor, mes);
        this.taxaSelic = taxaSelic;
        this.taxaTR = taxaTR;
        
        
    }
    
    public double getTaxaSelic(){
        return taxaSelic;
    }
    public double getTaxaTR(){
        return taxaTR;
    }
    public double rendimentoPoupanca(){
        double rendimentoP;
        double valorF;
        rendimentoP = 0.7 * getTaxaSelic() + getTaxaTR();
        valorF = getValor()*Math.pow((1+rendimentoP/100),getMes());
        return valorF;
    }
    
}
