package q.app;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.time.LocalDate;
import java.util.Arrays;
/**
 *
 * @author fhugo
 */

public class Analista extends Funcionario {
	private String[] diagrama;

	public String[] getDiagrama() {
		return diagrama;
	}

	public void setDiagrama(String[] diagrama) {
		this.diagrama = diagrama;
	}

	public Analista() {
		super();
		this.diagrama = new String[5];
	}

	public Analista(String cpf, String nome, char sexo, double salarioBruto, LocalDate dataNascimento,
			LocalDate dataAdmicao, String[] diagrama) {
		super(cpf, nome, sexo, salarioBruto, dataNascimento, dataAdmicao);

		this.diagrama = diagrama;
	}

	public boolean programaMesmasLinguagens(Analista analista) {
		boolean asMesmas = true;
		if (this.diagrama.length != analista.getDiagrama().length)
			return false;

		for (int i = 0; i < diagrama.length; i++) {
			asMesmas = asMesmas && (this.getDiagrama()[i] == null ? analista.getDiagrama()[i] == null : this.getDiagrama()[i].equals(analista.getDiagrama()[i]));
		}

		return asMesmas;
	}

	@Override
	public double getBonificacao() {
		double bonificacao = (3 / 100) * 12 * getSalarioBruto();
		return bonificacao;
	}

	@Override
	public String toString() {
		return "Programador \ndiagrama = " + Arrays.toString(diagrama) + "\nCPF = " + getCpf() + "\nNome = " + getNome()
				+ "\nSexo = " + getSexo() + "\nSalario Bruto = " + getSalarioBruto() + "\nData De Nascimento = "
				+ getDataNascimento() + "\nData De Admicao = " + getDataAdmicao();
	}
}
