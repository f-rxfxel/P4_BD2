package ex2jpamaven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cpf;
	@Column(name = "nomecliente")
	private String nome;
	@Column(name = "emailcliente")
	private String email;
	@Column(name = "telefonecliente")
	private String telefone;

	public Cliente() {

	}
	
	public Cliente(Integer cpf, String nome, String email, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}

	
}
