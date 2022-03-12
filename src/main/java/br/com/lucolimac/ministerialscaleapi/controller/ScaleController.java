package br.com.lucolimac.ministerialscaleapi.controller;

import br.com.lucolimac.ministerialscaleapi.models.Scale;
import br.com.lucolimac.ministerialscaleapi.repository.ScaleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("scales")
public class ScaleController {

    private final ScaleRepository scaleRepository;

    public ScaleController(ScaleRepository scaleRepository) {
        this.scaleRepository = scaleRepository;
    }

    @GetMapping
    public List<Scale> allScales() {
        return (List<Scale>) scaleRepository.findAll();
    }

    @GetMapping(path = {"{id}"})
    public ResponseEntity<Scale> findById(@PathVariable long id) {
        return scaleRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Scale create(@RequestBody Scale scale) {
        return scaleRepository.save(scale);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<Scale> update(@PathVariable("id") long id,
                                        @RequestBody Scale scale) {
        return scaleRepository.findById(id)
                .map(record -> {
                    if (scale.getHour() != null)
                        record.setHour(scale.getHour());
                    if (scale.getDate() != null)
                        record.setDate(scale.getDate());
                    if (scale.getMinister() != null)
                        record.setMinister(scale.getMinister());
                    if (scale.getPlace() != null)
                        record.setPlace(scale.getPlace());
                    Scale updated = scaleRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = {"{id}"})
    public ResponseEntity<?> delete(@PathVariable long id) {
        return scaleRepository.findById(id)
                .map(record -> {
                    scaleRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("byDate")
    public ResponseEntity<List<Scale>> findByDate(@RequestParam LocalDate date) {
        return scaleRepository.findByDate(date)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
