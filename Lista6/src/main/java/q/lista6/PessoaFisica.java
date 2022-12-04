package q.lista6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *
 * @author fhugo
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private LocalDate dataNascimento;

    public PessoaFisica(String cpf, String nome, LocalDate dataNascimento) {
        super(nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaFisica other = (PessoaFisica) obj;
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public boolean validarDocumento() {
        return this.cpf.length() == 14;
    }

    @Override
    public int calcularIdade() {
        Period idade = Period.between(this.dataNascimento, LocalDate.now());
        return idade.getYears();
    }
    
        @Override
    public String toString(){
        return "Nome: " + getNome() +
                "\nCpf: " +getCpf()+
                "\nData de Nascimento: "+ getDataNascimento();
    }
}
