package sprint4api.api.compass.entity;

import java.time.LocalDate;

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
}
