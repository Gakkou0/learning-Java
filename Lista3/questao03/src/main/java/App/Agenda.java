/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author fhugo
 */
public class Agenda {
        private Contatos[] contatos;

    Agenda() {
        this.contatos = new Contatos[100];
    }


    public void deletarID(int id) {
        if (id >= 0 && id < 99) {
            contatos[id] = null;
        }
    }

    public void adicionarContato(Contatos contato) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                break;
            }

        }
    }

    public void listarContatos() {
        Contatos[] contato = getContatos();
        if (contato.length > 0) {
            for (int i = 0; i < contato.length; i++) {
                if (contato[i] != null) {
                    System.out.println("" + contato[i].toString(i));
                }
            }
        } else {
            System.out.println("Nenhum dado foi encontrado");
        }

    }

    public void atualizarContato(Contatos contato, int id) {
        contatos[id] = contato;
    }

    public Contatos[] getContatos() {
        return contatos;
    }

    public void setContatos(Contatos[] contatos) {
        this.contatos = contatos;
    }
    
}
