package br.com.lucolimac.ministerialscaleapi.repository;

import br.com.lucolimac.ministerialscaleapi.models.Scale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ScaleRepository extends CrudRepository<Scale, Long> {
    Optional<List<Scale>> findByDate(LocalDate date);
}