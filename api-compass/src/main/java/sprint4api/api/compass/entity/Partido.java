package sprint4api.api.compass.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Partido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomePartido;
	
	private String sigla;
	
	@Enumerated(EnumType.STRING)
	private Ideologia ideologia;
	
	@JsonFormat(pattern = "dd/MM/yyyy" , shape = JsonFormat.Shape.STRING )
	private LocalDate dataFundacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePartido() {
		return nomePartido;
	}

	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Ideologia getIdeologia() {
		return ideologia;
	}

	public void setIdeologia(Ideologia ideologia) {
		this.ideologia = ideologia;
	}

	public LocalDate getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataFundacao, id, ideologia, nomePartido, sigla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return Objects.equals(dataFundacao, other.dataFundacao) && Objects.equals(id, other.id)
				&& ideologia == other.ideologia && Objects.equals(nomePartido, other.nomePartido)
				&& Objects.equals(sigla, other.sigla);
	}

	
	
	
	

}
