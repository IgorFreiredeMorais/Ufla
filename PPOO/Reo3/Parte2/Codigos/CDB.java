
package carrinhoteste;

public class CDB extends Investimentos {
    private double taxaCDI;
    
    
    public CDB(double valor, int mes, double taxaCDI){
        super(valor, mes);
        this.taxaCDI = taxaCDI;
        
    }
    
    public double rendimentoCDB(){
        double rendimentoCDB;
        double valorF;
        rendimentoCDB = 1.2 * getTaxaCDI();
        valorF = getValor()*Math.pow((1+rendimentoCDB/100),getMes());
        return valorF;
    }
    
    
    public double getTaxaCDI(){
        return taxaCDI;
    }
}
