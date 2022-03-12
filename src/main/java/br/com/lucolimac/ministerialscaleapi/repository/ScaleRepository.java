package br.com.lucolimac.ministerialscaleapi.repository;

import br.com.lucolimac.ministerialscaleapi.models.Scale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScaleRepository extends CrudRepository<Scale, Long> {
}