
package carrinhoteste;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        double valor, taxaSelic, taxaTR, taxaCDI, valorInicial, valorFinal, resultado1, resultado2, resultado3;
        int tempo;
        
        System.out.println("###### SIMULAÇÃO ######");
        System.out.print("Entre com o valor a ser investido: ");
        valor = teclado.nextDouble();
        System.out.print("Entre com a duração da aplicação em meses: ");
        tempo = teclado.nextInt();
        Investimentos banco = new Investimentos(valor, tempo);
        System.out.println("1 - Investimento em poupança");
        System.out.print("Entre com o valor da taxa Selic em %: ");
        taxaSelic = teclado.nextDouble();
        System.out.print("Entre com o valor da taxa referencial (TR) em %: ");
        taxaTR = teclado.nextDouble();
        Poupanca poupanca = new Poupanca(valor, tempo, taxaSelic, taxaTR);
        
        System.out.printf("Valor final para investimento em poupança: %.2f ", poupanca.rendimentoPoupanca());
        
        
        System.out.println();
        System.out.println("2 - Investimento em CDB");
        System.out.print("Entre com o valor da taxa CDI em %: ");
        taxaCDI = teclado.nextDouble();
        CDB cdb = new CDB(valor, tempo, taxaCDI);
        
        System.out.printf("Valor final para investimento em CDB: %.2f ", cdb.rendimentoCDB());
        
        
        System.out.println();
        System.out.println("3 - Investimento em ação");
        System.out.print("Entre com o preço inicial da ação: ");
        valorInicial = teclado.nextDouble();
        System.out.print("Entre com o preço final da ação: ");
        valorFinal = teclado.nextDouble();
        Acoes acao = new Acoes(valor, tempo, valorInicial, valorFinal);
        
        System.out.printf("Valor final para investimento em ação: %.2f ", acao.rendimentoAcao());
        System.out.println();
        
    }
}
