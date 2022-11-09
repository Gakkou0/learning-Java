
package q.lista6;

/**
 *
 * @author fhugo
 */
public interface Colecao {
    
    boolean inserir(Pessoa p);
    boolean remover();
    boolean remover(int index);
    void atualizar(int index, Pessoa p);
    boolean pesquisar(Pessoa p);
    boolean colecaoEstaVazia();
    void imprimirDadosColecao();
    Pessoa retornarObj(int index);
}
