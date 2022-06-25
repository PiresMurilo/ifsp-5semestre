package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receitas")
public class Receita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "nome_medicamento", length = 155, nullable = false)
	protected String nomeMedicamento;
	
	@Column(name = "status", length = 12, nullable = false)
	protected boolean status;
	
	@Column(name = "data_receita", length = 12)
	protected String dataReceita;
	
	@Column(name = "dados_paciente_validos", length = 12, nullable = false)
	protected boolean dadosPacienteValidos;
	
	@Column(name = "dados_medico_validos", length = 12, nullable = false)
	protected boolean dadosMedicoValidos;
	
	public Receita(int id) {
		this.id = id;
		this.nomeMedicamento = " ";
		this.status = false;
		this.dataReceita = " ";
		this.dadosMedicoValidos = false;
		this.dadosPacienteValidos = false;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeMedicamento() {
		return nomeMedicamento;
	}
	
	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDataReceita() {
		return dataReceita;
	}
	
	public void setDataReceita(String dataReceita) {
		this.dataReceita = dataReceita;
	}
	
	public boolean isDadosPacienteValidos() {
		return dadosPacienteValidos;
	}
	
	public void setDadosPacienteValidos(boolean dadosPacienteValidos) {
		this.dadosPacienteValidos = dadosPacienteValidos;
	}
	
	public boolean isDadosMedicoValidos() {
		return dadosMedicoValidos;
	}
	
	public void setDadosMedicoValidos(boolean dadosMedicoValidos) {
		this.dadosMedicoValidos = dadosMedicoValidos;
	}
	
	public boolean validarReceita()
	{	
		if (this.dadosMedicoValidos && this.dadosPacienteValidos) {
			this.setStatus(true);
			return true;
		}
			
		else{
			this.setStatus(false);
			return false;
		}
	}

}
