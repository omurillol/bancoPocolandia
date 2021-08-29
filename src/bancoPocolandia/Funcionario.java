package bancoPocolandia;

public class Funcionario {
	private String nome;
	private double salario;
	private String cpf;
	
	public double getBonificacao() {
		return this.salario + 0.05;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario>0) {
		this.salario = salario;
		}else {
			System.out.println("Erro. Salário menor que R$1");
		}
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
