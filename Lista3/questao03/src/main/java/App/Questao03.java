/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package App;

import java.util.Scanner;

/**
 *
 * @author fhugo
 */
public class Questao03 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner ler = new Scanner(System.in);
        int id;
        for (boolean i = true; i == true;) {
            System.out.println("1 - Cadastrar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Atualizar Contato");
            System.out.println("4 - Lista de Contatos");
            System.out.println("5 - Sair");

            int x = ler.nextInt();
            switch (x) {
                case 1 -> {
                    Contatos contato = Contatos.formContato();
                    agenda.adicionarContato(contato);
                }
                case 2 -> {
                    agenda.listarContatos();
                    System.out.println("Digite o id para deletar");
                    id = ler.nextInt();
                    agenda.deletarID(id);
                }
                case 3 -> {
                    System.out.println("Digite o id que quer atualizar");
                    id = ler.nextInt();
                    Contatos atualizarContato = Contatos.formContato();
                    agenda.atualizarContato(atualizarContato, id);
                }
                case 4 ->
                    agenda.listarContatos();

                case 5 -> {
                    i = false;
                }
                default -> {
                    System.out.println("tente novamente");
                    i = false;
                }
            }
        }
    }
}
