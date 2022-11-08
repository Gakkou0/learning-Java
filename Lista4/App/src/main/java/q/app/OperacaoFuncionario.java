
package q.app;

/**
 *
 * @author fhugo
 */
public class OperacaoFuncionario {
    
    public static void verificaFuncionario(Funcionario[] funcionarios){
        for(Funcionario funcionario : funcionarios){
            if (funcionario.validateCpf() && funcionario.validateAdmicao() && funcionario.validateNascimento()){
                System.out.println("Dados validos: \n" + funcionario);
            } else {
                System.out.println("Dados invalidos: \n" + funcionario);
            }
        }
    }
    
    public static void contaGenero(Funcionario[] funcionarios){
        int mulher = 0, homem = 0;
        for(Funcionario funcionario : funcionarios){
            if (funcionario.getSexo() == 'F'){
                mulher++;
            } else {
                homem++;
            }
        }
            System.out.println("Quantidade de homens: " + homem +
            "\nQuantidade de mulheres: " + mulher);
    }
    
    public static void salarioMaxMin(Funcionario[] funcionarios){
        int index = 0;
        int indexMaior = 0;
        int indexMenor = 0;
        double maior = funcionarios[0].salarioLiquido();
        double menor = funcionarios[0].salarioLiquido();
        for(Funcionario funcionario : funcionarios){
            if (funcionario.salarioLiquido()> maior){
                maior = funcionario.salarioLiquido();
                indexMaior = index;
            } else if (funcionario.salarioLiquido()< menor) {
                menor = funcionario.salarioLiquido();
                indexMenor = index;
            }
            
            index++;
        }
        
        System.out.println("Maior Salario: "+ funcionarios[indexMaior] +
        "Menor salario: " + funcionarios[indexMenor]);
    }
    
    public static void idadeMaxMin(Funcionario[] funcionarios){
        int index = 0;
        int indexMaior = 0;
        int indexMenor = 0;
        double maior = funcionarios[0].convertIdade();
        double menor = funcionarios[0].convertIdade();
        for (Funcionario funcionario : funcionarios){
            if (funcionario.convertIdade()> maior){
                maior = funcionario.convertIdade();
                indexMaior = index;
            } else if (funcionario.convertIdade()< menor) {
                menor = funcionario.convertIdade();
                indexMenor = index;
            }
            
            index++;
        }
        
        System.out.println("Mais velho: "+ funcionarios[indexMaior] +
        "Mais novo: " + funcionarios[indexMenor]);
    }
}
