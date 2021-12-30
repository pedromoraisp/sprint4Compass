package sprint4api.api.compass.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sprint4api.api.compass.controller.formDto.AssociadoFormDTO;
import sprint4api.api.compass.dto.AssociadoDto;




@RestController
@RequestMapping("/associados")
public class AssociadoController {
	
	public interface AssociadoService {

		ResponseEntity<AssociadoDto> salvaAssociado(AssociadoFormDTO form);

	}

	@Autowired
    private AssociadoService service;
	
    @PostMapping
    @Transactional
    @CacheEvict(value = "listAssociados", allEntries = true)
    public ResponseEntity<AssociadoDto> salvaAssociados(@RequestBody @Validated AssociadoFormDTO form){
        
        return this.service.salvaAssociado(form);
        
    }
}
