
package q.lista6;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author fhugo
 */
public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private LocalDate dataCriacao;

    public PessoaJuridica(String nome, String cnpj, LocalDate dataCriacao) {
        super(nome);
        this.cnpj = cnpj;
        this.dataCriacao = dataCriacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    @Override
    public boolean validarDocumento() {
        return this.cnpj.length() == 18;
    }

    @Override
    public int calcularIdade() {
        Period idade = Period.between(this.dataCriacao, LocalDate.now());
        return idade.getYears();
    }
    
}
