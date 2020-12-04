
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Extrato meuExtrato = new Extrato();
        int dia, mes, ano, numeroParcelas;
        double valor;
        String horario, cpf, cnpj, formaRecebimento;
        System.out.print("digite o dia:");
        dia = teclado.nextInt();
        System.out.print("digite o mes:");
        mes = teclado.nextInt();
        System.out.print("digite o ano:");
        ano = teclado.nextInt();
        System.out.print("digite o horario:");
        horario = teclado.next();
        System.out.print("digite o valor:");
        valor = teclado.nextDouble();
        MovimentacaoFinanceira movimentacaoFinanceira = new MovimentacaoFinanceira(dia, mes, ano, horario, valor);
        meuExtrato.inserirArray(movimentacaoFinanceira);
        System.out.print("digite o cnpj:");
        cnpj = teclado.next();
        System.out.print("digite o numero de parcelas:");
        numeroParcelas = teclado.nextInt();
        Despesa despesa1 = new Despesa(dia, mes, ano, horario, valor, cnpj, numeroParcelas);

        System.out.println();

        System.out.print("digite o dia:");
        dia = teclado.nextInt();
        System.out.print("digite o mes:");
        mes = teclado.nextInt();
        System.out.print("digite o ano:");
        ano = teclado.nextInt();
        System.out.print("digite o horario:");
        horario = teclado.next();
        System.out.print("digite o valor:");
        valor = teclado.nextDouble();
        MovimentacaoFinanceira movimentacaoFinanceira2 = new MovimentacaoFinanceira(dia, mes, ano, horario, valor);
        meuExtrato.inserirArray(movimentacaoFinanceira2);
        System.out.print("digite o cnpj:");
        cnpj = teclado.next();
        System.out.print("digite o numero de parcelas:");
        numeroParcelas = teclado.nextInt();
        Despesa despesa2 = new Despesa(dia, mes, ano, horario, valor, cnpj, numeroParcelas);

        System.out.println();

        System.out.print("digite o dia:");
        dia = teclado.nextInt();
        System.out.print("digite o mes:");
        mes = teclado.nextInt();
        System.out.print("digite o ano:");
        ano = teclado.nextInt();
        System.out.print("digite o horario:");
        horario = teclado.next();
        System.out.print("digite o valor:");
        valor = teclado.nextDouble();
        MovimentacaoFinanceira movimentacaoFinanceira3 = new MovimentacaoFinanceira(dia, mes, ano, horario, valor);
        meuExtrato.inserirArray(movimentacaoFinanceira3);
        System.out.print("digite o cpf:");
        cpf = teclado.next();
        System.out.print("digite o forma de pagamento:");
        formaRecebimento = teclado.next();
        Receita receita1 = new Receita(dia, mes, ano, horario, valor, cpf, formaRecebimento);

        System.out.println();

        System.out.print("digite o dia:");
        dia = teclado.nextInt();
        System.out.print("digite o mes:");
        mes = teclado.nextInt();
        System.out.print("digite o ano:");
        ano = teclado.nextInt();
        System.out.print("digite o horario:");
        horario = teclado.next();
        System.out.print("digite o valor:");
        valor = teclado.nextDouble();
        MovimentacaoFinanceira movimentacaoFinanceira4 = new MovimentacaoFinanceira(dia, mes, ano, horario, valor);
        meuExtrato.inserirArray(movimentacaoFinanceira4);
        System.out.print("digite o cpf:");
        cpf = teclado.next();
        System.out.print("digite a forma de pagamento:");
        formaRecebimento = teclado.next();
        Receita receita2 = new Receita(dia, mes, ano, horario, valor, cpf, formaRecebimento);

        System.out.println();
        System.out.println("------------ Primeira movimentacao -------------");
        System.out.println(despesa1);
        System.out.println();
        System.out.println("------------ Segunda movimentacao -------------");
        System.out.println(despesa2);
        System.out.println();
        System.out.println("------------ Terceira movimentacao -------------");
        System.out.println(receita1);
        System.out.println();
        System.out.println("------------ Quarta movimentacao -------------");
        System.out.println(receita2);
    }

}
