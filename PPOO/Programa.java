
package carrinhoteste;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Extrato meuExtrato = new Extrato();
        int dia, mes, ano, numeroParcelas;
        double valor;
        String horario, cpf, cnpj, formaRecebimento;
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        horario = teclado.nextLine();
        valor = teclado.nextDouble();
        MovimentacaoFinanceira movimentacaoFinanceira = new MovimentacaoFinanceira(dia,mes,ano,horario,valor);
        meuExtrato.inserirArray(movimentacaoFinanceira);
        cnpj = teclado.nextLine();
        numeroParcelas = teclado.nextInt();
        Despesa despesa1 = new Despesa(dia,mes,ano,horario,valor,cnpj,numeroParcelas);
        System.out.println(despesa1);

        dia = teclado.nextInt();
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        horario = teclado.nextLine();
        valor = teclado.nextDouble();
        MovimentacaoFinanceira movimentacaoFinanceira2 = new MovimentacaoFinanceira(dia,mes,ano,horario,valor);
        meuExtrato.inserirArray(movimentacaoFinanceira2);
        cnpj = teclado.nextLine();
        numeroParcelas = teclado.nextInt();
        Despesa despesa2 = new Despesa(dia,mes,ano,horario,valor,cnpj,numeroParcelas);
        System.out.println(despesa2);

        dia = teclado.nextInt();
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        horario = teclado.nextLine();
        valor = teclado.nextDouble();
        MovimentacaoFinanceira movimentacaoFinanceira3 = new MovimentacaoFinanceira(dia,mes,ano,horario,valor);
        meuExtrato.inserirArray(movimentacaoFinanceira3);
        cpf = teclado.nextLine();
        formaRecebimento = teclado.nextLine();
        Receita receita1 = new Receita(dia,mes,ano,horario,valor,cpf,formaRecebimento);
        System.out.println(receita1);

        dia = teclado.nextInt();
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        horario = teclado.nextLine();
        valor = teclado.nextDouble();
        MovimentacaoFinanceira movimentacaoFinanceira4 = new MovimentacaoFinanceira(dia,mes,ano,horario,valor);
        meuExtrato.inserirArray(movimentacaoFinanceira4);
        cpf = teclado.nextLine();
        formaRecebimento = teclado.nextLine();
        Receita receita2 = new Receita(dia,mes,ano,horario,valor,cpf,formaRecebimento);
        System.out.println(receita2);


    }
    
}
