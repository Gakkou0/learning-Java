/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package q.questao01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fhugo
 */
public class App {

    public static void main(String[] args) {
        
        ArrayList<ContaLuz> lista = new ArrayList<ContaLuz>(); 
        
        int controle = 1;
        Scanner ler = new Scanner(System.in);
        while (controle == 1){
            System.out.println("Digite o codigo da sua conta: ");
            String contaCodigo = ler.next();
            System.out.println("Digite a data de leitura apenas numeros (ddMMyyyy)");
            int dataLeitura = ler.nextInt();
            System.out.println("Informe a quantidade de kw gastos no mês: ");
            int kwGasto = ler.nextInt();
            System.out.println("Digite o valor da conta");
            double valorDaConta = ler.nextDouble();
            System.out.println("Digite a data de vencimento apenas numeros (ddMMyyyy)");
            int dataVencimento = ler.nextInt();
            System.out.println("Digite a data de pagamento apenas numeros (ddMMyyyy)");
            int dataPagamento = ler.nextInt();
            boolean pagoNoPrazo;
            if ((dataVencimento - dataPagamento) < 0){
                pagoNoPrazo = false;
            } else {
                pagoNoPrazo = true;
            }
            
            ContaLuz conta = new ContaLuz(contaCodigo, dataLeitura, kwGasto, valorDaConta, dataVencimento, pagoNoPrazo);
            lista.add(conta);
            
            System.out.println("Adicionar mais contas? 1 ou 0");
            controle = ler.nextInt();
        }
    }
}
