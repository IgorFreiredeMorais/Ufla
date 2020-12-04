
package carrinhoteste;

public class Carrinho{
 private String cliente;
 private String[] carrinho;
 private int dia;
 private int mes;
 private int ano;
 private int contadorItens;
 private int qtd;

 public Carrinho(String cliente, int dia, int mes, int ano){
 this.cliente = cliente;
 this.dia = dia;
 this.mes = mes;
 this.ano = ano;
 carrinho = new String[5];
 contadorItens = 0;
 }
 public Carrinho(String cliente, int dia, int mes, int ano, int qtd){
 this.cliente = cliente;
 this.dia = dia;
 this.mes = mes;
 this.ano = ano;
 this.qtd = qtd;
 carrinho = new String[qtd];
 contadorItens = 0;
 }
 
 
 public void exibir(){
     System.out.printf("Cliente: %s %n", cliente);
     System.out.printf("Data da compra: %d/%d/%d%n",dia, mes, ano);
     System.out.print("Itens do carrinho: ");
         for (int i = 0; i < carrinho.length; i++) {
         System.out.print( carrinho[i] );
         System.out.print(" ");
         }
     
     System.out.println();
 }
 public String [] getCarrinho(){
     return carrinho;
 }
 public void inserirItem(String produto){
 carrinho[contadorItens] = produto;
 contadorItens++;
 }
}
 
