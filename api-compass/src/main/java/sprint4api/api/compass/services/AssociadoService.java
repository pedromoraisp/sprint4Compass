package sprint4api.api.compass.services;

import java.util.List;


import org.springframework.http.ResponseEntity;

import sprint4api.api.compass.dto.AssociadoDto;
import sprint4api.api.compass.controller.formDto.AssociadoFormDTO;

public interface AssociadoService {
	
	ResponseEntity<AssociadoDto> salvaAssociado(AssociadoFormDTO body);

    ResponseEntity<List<AssociadoDto>> getAssociados(String cargo, Boolean OrdNome);

    ResponseEntity<AssociadoDto> listaAssociado(Long id);

    ResponseEntity<AssociadoDto> updateAssociado(Long id, AssociadoFormDTO formDTO);


}
