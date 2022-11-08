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
        Funcionario funcionario = new Funcionario("743362628", "Alberto", 'c', 37812, nascimento, teste);
        
        
        
        System.out.println(funcionario.getNome());
    }
}
