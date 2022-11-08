package q.app;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

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
    
    public Funcionario(){
        this.dataAdmicao = LocalDate.now();
    }

    public Funcionario(String cpf, String nome, char sexo, double salarioBruto, LocalDate dataNascimento, LocalDate dataAdmicao) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.salarioBruto = salarioBruto;
        this.dataNascimento = dataNascimento;
        this.dataAdmicao = dataAdmicao;
    }

    public boolean validateCpf() {
        return this.cpf.length() == 14;
    }
    
    public boolean validateNascimento(){
        LocalDate DataValida = LocalDate.of(1921, 1, 1);
        return this.dataNascimento.isAfter(DataValida) ;
    }
    
    public boolean validateAdmicao(){
        LocalDate DataValida = LocalDate.of(1995, 1, 1);
        return this.dataAdmicao.isAfter(DataValida) ;
    }
    
    public int convertIdade(){
        LocalDate agora = LocalDate.now();
        Period idade = Period.between(this.dataNascimento, agora);
        
        return idade.getYears();
    }
    
    public double salarioLiquido(){
        
        double salarioLiquido;
        if (this.salarioBruto <= 3000){
            salarioLiquido =  this.salarioBruto - (0.17 * this.salarioBruto); 
        } else {
            salarioLiquido =  this.salarioBruto - (0.27 * this.salarioBruto); 
        }
        return salarioLiquido;
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
        final Funcionario other = (Funcionario) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
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
    
    public void setDataNascimento(LocalDate nascimento){
        this.dataNascimento = nascimento;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nCpf: " + getCpf() +
                "\nSexo: " + getSexo() +
                "\nData de nascimento: " + getDataNascimento() +
                "\nSalario Bruto " + getSalarioBruto() +
                "\ndata de Admição: " + getDataAdmicao();
    }
}
