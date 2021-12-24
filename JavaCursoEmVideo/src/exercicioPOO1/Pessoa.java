package exercicioPOO1;

public class Pessoa {

	private String nome;
	private short idade;
	private String sexo;
	
	
	public Pessoa(String nome, short idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public short getIdade() {
		return idade;
	}

	public void setIdade(short idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void fazerAniver() {
		this.idade++;
	}
	
	
}
