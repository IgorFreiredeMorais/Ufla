

import java.util.ArrayList;

public class Extrato {
    private ArrayList<MovimentacaoFinanceira> movimentacao;
    
    public Extrato(){
       movimentacao = new ArrayList<MovimentacaoFinanceira>();
    }

    public void inserirArray(MovimentacaoFinanceira aux){
        movimentacao.add(aux);
    }
}
