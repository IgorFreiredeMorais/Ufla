
package carrinhoteste;
import java.util.Scanner;

public class CarrinhoTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carrinho novoCarrinho;
        Carrinho novoCarrinho2;
        String nome;
        int qtd;
        System.out.print("Digite a quantidade de itens do carrinho: ");
        qtd = teclado.nextInt();
        System.out.println("Agora digite os itens do carrinho: ");
        if (qtd==5) {
             novoCarrinho = new Carrinho("Igor",3,10,2000);
             for (int i = 0; i < 5; i++) {
                nome = teclado.next();
                novoCarrinho.inserirItem(nome);
            }
             novoCarrinho.exibir(); 
        }
        else if (qtd !=5) {
            novoCarrinho2 = new Carrinho("Igor",3,10,2000,qtd);
            for (int i = 0; i < qtd; i++) {
                nome = teclado.next();
                novoCarrinho2.inserirItem(nome);
            }
            novoCarrinho2.exibir();
           
        }
    }
}
