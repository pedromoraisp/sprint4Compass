package sprint4api.api.compass.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Partido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sigla;
	private String nomeDoPartido;
	
	@Enumerated(EnumType.STRING)
	private LocalDate dataFundacao;
	private Ideologia ideologia;
	
	

}
