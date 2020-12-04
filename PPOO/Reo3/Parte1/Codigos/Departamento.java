
package carrinhoteste;

import java.util.ArrayList;

public class Departamento {
   private String sigla;
   private ArrayList<Disciplina> disciplinas;
   
  
   public  Departamento(String sigla){
       this.sigla = sigla;
       disciplinas = new ArrayList();
       
   }
   public void adicionarDisciplina(Disciplina d){
       disciplinas.add(d);
 
    }
   private Disciplina buscarDisciplina(String codigo){
       int posicaoDisciplina = -1;
       for (int i = 0; i < disciplinas.size(); i++) {
           if(disciplinas.get(i).getCodigo().equals(codigo)){
               posicaoDisciplina = i;
           }
       }
       if (posicaoDisciplina != -1) {
           return disciplinas.get(posicaoDisciplina);
       }
       else{
           return null;
       }
   }
   
   public void  removerDisciplina(String codigo){
       
       disciplinas.remove(buscarDisciplina(codigo));
   }
   
   public void listarDisciplinas(){
       for (Disciplina disciplina : disciplinas) {
           System.out.printf("Disciplina: %s / Carga Horaria Semanal: %d%n",disciplina.getCodigo(), disciplina.getCargaHorariaSemanal());
       }
    
   }
}
