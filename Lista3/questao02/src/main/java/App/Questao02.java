/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package App;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fhugo
 */
public class Questao02 {

    public static void main(String[] args) {
        int controle = 1;
        ArrayList<Dvd> lista = new ArrayList<>();
        double total = 0;
        double maiorValor = 0, menorValor = 0;
        int maiorValorId = 0, menorValorId = 0;

        Scanner ler = new Scanner(System.in);

        while (controle == 1) {

            System.out.println("Digite o titulo: ");
            String titulo = ler.next();
            
            System.out.println("Digite o codigo: ");
            int codigo = ler.nextInt();
            
            System.out.println("Digite o ano de lançamento: (ddMMyyy)");
            int anoLancamento = ler.nextInt();
            String genero = ler.next();
            
            System.out.println("Digite o valor pago: ");
            double valorPago = ler.nextDouble();
            total += valorPago;
            
            if (lista.isEmpty()) {
                maiorValor = valorPago;
                menorValor = valorPago;
            } else if(maiorValor<valorPago){
                maiorValor = valorPago;
                maiorValorId = lista.size();
            } else if(menorValor>valorPago){
                menorValor = valorPago;
                menorValorId = lista.size();
            }

            maiorValorId = (maiorValor < valorPago) ? lista.size() : maiorValorId;
            menorValorId = (menorValor > valorPago) ? lista.size() : menorValorId;
            
            System.out.println("Digite o nome da gravadora");
            String gravadora = ler.next();
            
            System.out.println("Digite o nome do Autor");
            String nome = ler.next();
            
            
            boolean solo = true;

            Autor autor = new Autor(nome, solo);
            Dvd dvd = new Dvd(titulo, codigo, anoLancamento, genero, valorPago, gravadora, autor);

            lista.add(dvd);
            System.out.println("Total gasto: R$ "+ total);
        }
        
        System.out.println("==================================");
        System.out.println("Dvd mais caro: Dvd " + (maiorValorId + 1) + "\n\n" + lista.get(maiorValorId));
        System.out.println("==================================");
        System.out.println("Dvd mais barato: Dvd " + (menorValorId + 1) + "\n\n" + lista.get(menorValorId));
        System.out.println("==================================");
    }
}
