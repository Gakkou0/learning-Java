package q.lista6;

/**
 *
 * @author fhugo
 */
public class ColecaoPessoa implements Colecao {

    private Pessoa[] dados;
    private int posicaoCorrente;

    public ColecaoPessoa(Pessoa[] dados) {
        this.dados = dados;
    }

    public ColecaoPessoa(Pessoa[] dados, int posicaoCorrente) {
        this.dados = dados;
        this.posicaoCorrente = posicaoCorrente;
    }

    @Override
    public boolean inserir(Pessoa p) {
        try {
            Pessoa[] pessoa = new Pessoa[dados.length + 1];
            System.arraycopy(dados, 0, pessoa, 0, dados.length);
            pessoa[dados.length] = p;
            dados = pessoa;
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean remover(int index) {
        try {
            Pessoa[] pessoa = new Pessoa[dados.length - 1];
            for (int i = 0, k = 0; i < dados.length; i++) {
                if (i != this.posicaoCorrente) {
                    pessoa[k] = dados[i];
                    k++;
                }
            }
            dados = pessoa;
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public void atualizar(int index, Pessoa p) {
        try {
            this.dados[index] = p;
            System.out.println("Update completo\n" + p);
        } catch (Exception ex) {
            System.out.println("Erro no update");
        }
    }

    @Override
    public boolean pesquisar(Pessoa p) {
        boolean found = false;
        for (Pessoa x : this.dados) {
            if (x == p) {
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public boolean colecaoEstaVazia() {
        return this.dados.length == 0;
    }

    @Override
    public void imprimirDadosColecao() {
        for (Pessoa pessoa : this.dados) {
            System.out.println(pessoa + "\n");
        }
    }

    @Override
    public boolean remover() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pessoa retornarObj(int index) {
        return this.dados[index];
    }

}
