package q.questao01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fhugo
 */
public class Questao01 {

    public static void main(String[] args) {

        ArrayList<ContaLuz> lista = new ArrayList<>();

        int controle = 1;
        double soma = 0;
        Scanner ler = new Scanner(System.in);
        int maiorConta = 0 , menorConta = 0, maiorContaId = 0, menorContaId = 0;

        while (controle == 1) {
            System.out.println("Conta " + (lista.size()+1));
            System.out.println("Digite o codigo da sua conta: ");
            String contaCodigo = ler.next();
            
            System.out.println("Digite a data de leitura apenas numeros (ddMMyyyy)");
            int dataLeitura = ler.nextInt();
            
            System.out.println("Informe a quantidade de kw gastos no mês: ");
            int kwGasto = ler.nextInt();
            
            System.out.println("Digite o valor da conta");
            double valorDaConta = ler.nextDouble();
            soma += valorDaConta;
            
            maiorContaId = (maiorConta < valorDaConta) ? lista.size() : maiorContaId;
            
            System.out.println("Digite a data de vencimento apenas numeros (ddMMyyyy)");
            int dataVencimento = ler.nextInt();
            boolean foiPaga = false;
            boolean pagoNoPrazo = false;

            System.out.println("A conta foi paga?");
            if ("sim".equals(ler.next())) {
                foiPaga = true;

                System.out.println("Digite a data de pagamento apenas numeros (ddMMyyyy)");
                int dataPagamento = ler.nextInt();
                pagoNoPrazo = (dataVencimento - dataPagamento) >= 0;
            }

            ContaLuz conta = new ContaLuz(contaCodigo, dataLeitura, kwGasto, valorDaConta, dataVencimento, foiPaga, pagoNoPrazo);
            lista.add(conta);

            System.out.println(conta);
            
//            System.out.println("==================================");
//            
//            System.out.println("Conta mais cara: Conta " + (maiorContaId+1) + "\n\n" + lista.get(maiorContaId));
//            
//            System.out.println("==================================");

            System.out.println("Media de gasto: R$ " + soma / (lista.size()));

            System.out.println("Adicionar mais contas? 1  para sim ou 0 para não");
            controle = ler.nextInt();
        }
    }
}
