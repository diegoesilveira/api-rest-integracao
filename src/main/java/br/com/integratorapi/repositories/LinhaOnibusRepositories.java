package br.com.integratorapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.integratorapi.domain.LinhaOnibus;

@Repository
public interface LinhaOnibusRepositories extends CrudRepository<LinhaOnibus, Long>{

		default <S extends LinhaOnibus> void saveAll(Object[] entities) {
			// TODO Auto-generated method stub
			
		}

}
