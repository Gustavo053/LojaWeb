package web.eaj.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
        return  service.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Endereco> findOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PostMapping
    public Endereco add(@RequestBody Endereco e) {
        return service.add(e);
    }

    @PutMapping(path = "/{id}")
    public Endereco update(@RequestBody Endereco e, @PathVariable Long id) {
        e.setId(id);
        return service.update(e);
    }

    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
