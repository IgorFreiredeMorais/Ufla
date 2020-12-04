package carrinhoteste;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo, resposta;
        System.out.print("Digite o codigo do cafe do tipo do cafe(0: Americano/1: Expresso/2: Sem Cafeína):");
        codigo = teclado.nextInt();
        String tipodocafe = null;
        Cafe cafe1 = null;
        if (codigo == 0) {
            tipodocafe = "Americano";
            cafe1 = new Cafe(tipodocafe);
        }
        else if (codigo == 1) {
            tipodocafe = "Expresso";
            cafe1 = new Cafe(tipodocafe);
        }
        else if (codigo == 2) {
        
            tipodocafe = "Sem Cafeina";
            cafe1 = new Cafe(tipodocafe);
        }
        int tipo;
        System.out.print("Deseja adicionar algum complemento? (0: não ou 1: sim):");
        int contador = 1;
        resposta  = teclado.nextInt();
        while(resposta !=0){
            System.out.printf("Insira o código do %dº complemento desejado (0: leite, 1: chocolate, 2: canela):",contador);
            tipo = teclado.nextInt();
            cafe1.inserirComplemento(tipo);
            contador++;
            System.out.printf("Deseja adicionar outro complemento? (0: não ou 1: sim):");
            resposta  = teclado.nextInt();
        }
        
        float[] valordocafe = {7.50f, 4.30f, 10.00f};
        float[] valordoscomplementos = {5.00f, 8.00f, 2.00f};
        System.out.println("############### NOTA FISCAL ###############");
        System.out.printf("Cafe: %s%n", cafe1.getTipo());
        if (codigo==0) {
            System.out.printf("Preco do cafe: %.2f%n",valordocafe);
        }
        if (codigo==1) {
            System.out.printf("Preco do cafe: %.2f%n",valordocafe[1]);
        }
        if (codigo==2) {
            System.out.printf("Preco do cafe: %.2f%n",valordocafe[2]);
        }
        
        
        int tam;
        tam = cafe1.getComplemento();
        float preco=0;
        for (int i = 0; i < tam ; i++) {
            if (cafe1.getCodigo(i)==0) {
                preco+=valordoscomplementos[0];
            }
            else if (cafe1.getCodigo(i)==1) {
                preco+=valordoscomplementos[1];
            }
            else if (cafe1.getCodigo(i)==2) {
                preco+=valordoscomplementos[2];
            }
        }
        System.out.printf("Preco dos complementos: %.2f%n",preco);
        float resultado;
        resultado = valordocafe[codigo] + preco;
        
        System.out.printf("Total: %.2f%n",resultado);
    }
    
}