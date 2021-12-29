package sprint4api.api.compass.entity;

import java.time.LocalDate;

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
	
	
	

}
