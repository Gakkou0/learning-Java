/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.Scanner;

/**
 *
 * @author fhugo
 */
public class Contatos {

    private String nome;
    private String telefone;
    private String email;

    Contatos() {
    }

    ;

    public static Contatos formContato() {
        Scanner ler = new Scanner(System.in);
        Contatos contato = new Contatos();
        System.out.println("Digite o Nome");
        contato.nome = ler.nextLine();
        System.out.println("Digite o Email");
        contato.email = ler.nextLine();
        System.out.println("Digite o Telefone");
        contato.telefone = ler.nextLine();
        return contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString(int id) {
        return "Contato: [" + id + "]"
                + "Nome: " + nome
                + ", Telefone: " + telefone
                + ", Email: " + email;
    }

}
