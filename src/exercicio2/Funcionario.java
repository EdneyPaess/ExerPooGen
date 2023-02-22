package exercicio2;

public class Funcionario {

	private String nome;
	private int idade;
	private String nomeRua;
	private int numeroCasa;
	private String bairro;
	private String cidade;
	private String estado;

	public Funcionario(String nome, int idade, String nomeRua, int numeroCasa, String bairro, String cidade,
			String estado) {
		this.nome = nome;
		this.idade = idade;
		this.nomeRua = nomeRua;
		this.numeroCasa = numeroCasa;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void visualizar() {
		System.out.println(
				"O(a) Funcionario " + nome + " tem " + idade + " anos de idade, " + "mora na rua " + nomeRua + " no numero"
						+ numeroCasa + " no bairro " + bairro + " na cidade " + cidade + " no estado de" + estado);
	}

}
