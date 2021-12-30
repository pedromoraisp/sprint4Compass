package sprint4api.api.compass.dto;

import java.time.LocalDate;

import sprint4api.api.compass.entity.Associado;
import sprint4api.api.compass.entity.CargoPolitico;
import sprint4api.api.compass.entity.Partido;
import sprint4api.api.compass.entity.Sexo;

public class AssociadoDto {
	
private Long idAssociado;
	
	private String nome;
	
	private LocalDate dataNascimento;
	
	private CargoPolitico cargoPolitico;
	
	private Partido partido;
	
	private Sexo sexo;
	
	
	public AssociadoDto(Associado associado) {
		this.idAssociado = associado.getIdAssociado();
		this.nome = associado.getNome();
		this.dataNascimento = associado.getDataNascimento();
		this.cargoPolitico = associado.getCargoPolitico();
		this.partido = associado.getPartido();
		this.sexo = associado.getSexo();
	}

	public Long getIdAssociado() {
		return idAssociado;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public CargoPolitico getCargoPolitico() {
		return cargoPolitico;
	}

	public Partido getPartido() {
		return partido;
	}

	public Sexo getSexo() {
		return sexo;
	}

}
