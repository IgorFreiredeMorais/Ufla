
package carrinhoteste;

public class Investimentos {
    private double valor;
    private int mes;
    
    public Investimentos(double valor, int mes){
        this.valor = valor;
        this.mes = mes;
    }
    
    public double getValor(){
        return valor;
    }
   public int getMes(){
       return mes;
   }
}
