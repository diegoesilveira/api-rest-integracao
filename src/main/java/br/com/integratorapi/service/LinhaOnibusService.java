package br.com.integratorapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.integratorapi.domain.LinhaOnibus;
import br.com.integratorapi.repositories.LinhaOnibusRepositories;

@Service
public class LinhaOnibusService {
	
	@Autowired
	private LinhaOnibusRepositories repo;
	
	public void saveAll(List<LinhaOnibus> lista) {
		repo.saveAll(lista);
			
	}		
	
}
