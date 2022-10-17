package q.app;

import java.util.GregorianCalendar;

/**
 *
 * @author fhugo
 */
public final class Funcionario {

    private String cpf;
    private String nome;
    private char sexo;
    private double salarioBruto;
    private GregorianCalendar dataNascimento;
    private GregorianCalendar dataAdmicao;

    public Funcionario(String cpf, String nome, char sexo, double salarioBruto, int ano, int mes, int dia) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.salarioBruto = salarioBruto;
        setDataAdmicao(ano, mes, dia);
    }
    
    public void setDataAdmicao(){
    }
    
    public boolean validateCpf(String cpf){
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

    public void setDataAdmicao(int dia, int mes, int ano) {
        dataNascimento = new GregorianCalendar(ano, mes, dia);
    }

    @Override
    public String toString() {
        return "";
    }
}
