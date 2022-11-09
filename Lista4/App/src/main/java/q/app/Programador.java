package q.app;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.time.LocalDate;
import java.util.Arrays;
/**
 *
 * @author fhugo
 */

public class Programador extends Funcionario {
	private String[] linguagem;

	public String[] getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String[] linguagem) {
		this.linguagem = linguagem;
	}

	public Programador() {
		super();
		this.linguagem = new String[5];
	}

	public Programador(String cpf, String nome, char sexo, double salarioBruto, LocalDate dataNascimento,
			LocalDate dataAdmicao, String[] linguagem) {
		super(cpf, nome, sexo, salarioBruto, dataNascimento, dataAdmicao);
		this.linguagem = linguagem;
	}

	public boolean programaMesmasLinguagens(Programador programador) {
		boolean asMesmas = true;
		if (this.linguagem.length != programador.getLinguagem().length)
			return false;

		for (int i = 0; i < linguagem.length; i++) {
			asMesmas = asMesmas && (this.getLinguagem()[i] == programador.getLinguagem()[i]);
		}

		return asMesmas;
	}

	@Override
	public String toString() {
		return "Programador \nlinguagem = " + Arrays.toString(linguagem) + "\nCPF = " + getCpf() + "\nNome = " + getNome()
				+ "\nSexo = " + getSexo() + "\nSalario Bruto = " + getSalarioBruto() + "\nData De Nascimento = "
				+ getDataNascimento() + "\nData De Admicao = " + getDataAdmicao();
	}
}
