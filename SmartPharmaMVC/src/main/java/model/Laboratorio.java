package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laboratorios")
public class Laboratorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "razao_social", length = 155, nullable = false)
	protected String razaoSocial;
	
	@Column(name = "telefone", length = 15)
	protected String telefone;
	
	@Column(name = "endereco", length = 155)
	protected String endereco;
	
	@Column(name = "CNPJ", length = 14, nullable = false)
	protected String CNPJ;
	
	public Laboratorio(int id, String CNPJ) {
		this.id = id;
		this.razaoSocial = " ";
		this.telefone = " ";
		this.endereco = " ";
		this.CNPJ = CNPJ;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	public String getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

}
