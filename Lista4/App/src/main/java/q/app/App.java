package q.app;

import java.time.LocalDate;
/**
 *
 * @author fhugo
 */
public class App {

    public static void main(String[] args) {
        LocalDate teste = LocalDate.now();
        LocalDate nascimento = LocalDate.of(2004, 12, 28);
        Funcionario funcionario = new Funcionario("743362628", "Alberto", 'M', 37812, nascimento, teste);
        
        
        
        System.out.println(funcionario.validateCpf());
        System.out.println(funcionario.validateNascimento());
        System.out.println(funcionario.validateAdmicao());
        System.out.println(funcionario.convertIdade());
        
        Funcionario[] lista = new Funcionario[2];
        lista[0] = new Funcionario("23374336228", "Jurisvalda", 'F', 20, nascimento, teste);
        lista[1] = new Funcionario("319823891231123", "Valdisclaitão",'F', 10, LocalDate.of(2004, 1, 12), teste);
        
        OperacaoFuncionario.contaGenero(lista);
        OperacaoFuncionario.verificaFuncionario(lista);
        OperacaoFuncionario.idadeMaxMin(lista);
        OperacaoFuncionario.salarioMaxMin(lista);
        
    }
}
