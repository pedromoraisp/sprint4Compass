package sprint4api.api.compass.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class Associado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAssociado;
	
	private String nome;
	
	private LocalDate dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private CargoPolitico cargoPolitico;
	
	@ManyToOne
	@JoinColumn
	private Partido partido;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	public Long getIdAssociado() {
		return idAssociado;
	}

	public void setIdAssociado(Long idAssociado) {
		this.idAssociado = idAssociado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public CargoPolitico getCargoPolitico() {
		return cargoPolitico;
	}

	public void setCargoPolitico(CargoPolitico cargoPolitico) {
		this.cargoPolitico = cargoPolitico;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargoPolitico, dataNascimento, idAssociado, nome, partido, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Associado other = (Associado) obj;
		return cargoPolitico == other.cargoPolitico && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(idAssociado, other.idAssociado) && Objects.equals(nome, other.nome)
				&& Objects.equals(partido, other.partido) && sexo == other.sexo;
	}

	
	

}
