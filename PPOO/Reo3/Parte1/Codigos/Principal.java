
package carrinhoteste;
import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         int opcao;
         String codigo, remocao;
         Departamento departamento = new Departamento("DAC");
         Disciplina disciplina;
         System.out.println("########### SISTEMA DE CADASTRO ###########");
         System.out.println(" 1 - Cadastrar nova disciplina");
         System.out.println(" 2 - Remover disciplina");
         System.out.println(" 3 - Listar todas disciplinas");
         System.out.println(" 4 - Sair");
         System.out.print("Escolha o número correspondente a uma das opções anteriores:");
         opcao = teclado.nextInt();
            while(opcao != 4){
                switch(opcao){
                    case 1:
                        System.out.print("Digite o codigo da disciplina:");
                        codigo = teclado.next();
                        System.out.printf("Digite a carga horaria semanal da disciplina:");
                        int cargaHorariaSemanal = teclado.nextInt();
                        disciplina = new Disciplina(codigo,cargaHorariaSemanal);
                        departamento.adicionarDisciplina(disciplina);
                        break;
                    case 2:
                        System.out.printf("Digite o codigo da disciplina que voce deseja remover:");
                        remocao = teclado.next();
                        departamento.removerDisciplina(remocao);
                        break;
                    case 3:
                        departamento.listarDisciplinas();
                        break;
                    case 4:
                        break;
                }
                System.out.println();
                System.out.println("########### SISTEMA DE CADASTRO ###########");
                System.out.println(" 1 - Cadastrar nova disciplina");
                System.out.println(" 2 - Remover disciplina");
                System.out.println(" 3 - Listar todas disciplinas");
                System.out.println(" 4 - Sair");
                System.out.print("Escolha o número correspondente a uma das opções anteriores:");
                opcao = teclado.nextInt();
            }
     }
}
