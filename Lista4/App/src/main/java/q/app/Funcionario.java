package q.app;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author fhugo
 */
public class Funcionario {

    private String cpf;
    private String nome;
    private char sexo;
    private double salarioBruto;
    private LocalDate dataNascimento;
    private LocalDate dataAdmicao;
    //private Date dataParaManipular;
    //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Funcionario(String cpf, String nome, char sexo, double salarioBruto) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.salarioBruto = salarioBruto;
    }

    public boolean validateCpf(String cpf) {
        return cpf.length() == 14;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setDataAdmicao(LocalDate data) {
        this.dataAdmicao = data;
    }

    public LocalDate getDataAdmicao() {
        return dataAdmicao;
    }

    @Override
    public String toString() {
        return "";
    }
}
