
package q.lista6;

/**
 *
 * @author fhugo
 */
public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public abstract boolean validarDocumento();
    public abstract int calcularIdade();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
