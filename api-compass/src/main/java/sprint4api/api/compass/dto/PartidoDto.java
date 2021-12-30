package sprint4api.api.compass.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import sprint4api.api.compass.entity.Partido;
import sprint4api.api.compass.entity.Ideologia;

public class PartidoDto {

	private Long id;
	
	private String nomePartido;
	
	private String sigla;
	
	private Ideologia ideologia;
	
	@JsonFormat(pattern = "dd/MM/yyyy" , shape = JsonFormat.Shape.STRING )
	private LocalDate dataFundacao;
	
	public PartidoDto(Partido partido) {
		
		this.id = partido.getId();
		this.dataFundacao = partido.getDataFundacao();
		this.ideologia = partido.getIdeologia();
		this.nomePartido = partido.getNomePartido();
		this.sigla = partido.getSigla();
		
	}

	public Long getId() {
		return id;
	}

	public String getNomePartido() {
		return nomePartido;
	}

	public String getSigla() {
		return sigla;
	}

	public Ideologia getIdeologia() {
		return ideologia;
	}

	public LocalDate getDataFundacao() {
		return dataFundacao;
	}

	
}
