package web.eaj.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.eaj.web.models.Endereco;
import web.eaj.web.service.EnderecoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/endereco")
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
public class EnderecoController {
    EnderecoService service;

    @Autowired
    public void setService(EnderecoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Endereco> findAll() {
        return service.findAll();
    }

    @GetMapping(path = "/{id}")
    public Endereco findOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PostMapping
    public Endereco add(@RequestBody Endereco e) {
        return service.add(e);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Endereco> update(@RequestBody Endereco e, @PathVariable Long id) {
        if (service.findOne(id) == null) {
            return ResponseEntity.notFound().build();
        } else {
            e.setId(id);
            service.add(e);
            Endereco updated = service.findOne(id);
            return ResponseEntity.ok(updated);
        }
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@PathVariable Long id){
        return service
                .findById(id)
                .map(record -> {
                    service.delete(record);
                    return ResponseEntity.status(202).build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
