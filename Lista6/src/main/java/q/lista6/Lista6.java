
package q.lista6;

import java.time.LocalDate;

/**
 *
 * @author fhugo
 */
public class Lista6 {

    public static void main(String[] args) {
        
        Pessoa[] vetor = new Pessoa[5];
        
        vetor[0] = new PessoaJuridica("AndreCDs", "32.234.213/0001-01", LocalDate.of(2004, 2, 28));
        vetor[1] = new PessoaJuridica("MarceloCDs", "17.234.213/0001-01", LocalDate.of(1970, 8, 28));
        vetor[2] = new PessoaJuridica("PedroCDs", "54.234.213/0001-01", LocalDate.of(2012, 9, 28)); 
        vetor[3] = new PessoaFisica("463.123.321-42", "José", LocalDate.of(1915, 5, 12));
        vetor[4] = new PessoaFisica("220.984.213-60", "antonia", LocalDate.of(2001, 7, 2));
        
        ColecaoPessoa colecao = new ColecaoPessoa(vetor);
        
        colecao.atualizar(0, vetor[2]);
        System.out.println(colecao.colecaoEstaVazia());
        System.out.println(colecao.pesquisar(vetor[0]));
        System.out.println(colecao.retornarObj(4));
        colecao.imprimirDadosColecao();
        System.out.println(colecao.inserir(new PessoaFisica("220.984.213-60", "antonia", LocalDate.of(2001, 7, 2))));
    }
}
