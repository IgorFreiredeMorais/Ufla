import java.util.ArrayList;
public class FolhaDePagamento{
  private ArrayList<ListaDeBeneficiarios> list;
 
  public FolhaDePagamento(){
    list = new ArrayList<>();
  }
 
  public void cadastrarBeneficiario(ListaDeBeneficiarios l){
    list.add(l);
  }
 
  public void gerarFolhaPagamento(){
    for(ListaDeBeneficiarios l: list){
      System.out.println(l);
    }
  }
}