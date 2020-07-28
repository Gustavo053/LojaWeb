package web.eaj.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.eaj.web.models.Cliente;
import web.eaj.web.service.ClienteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    ClienteService service;

    @Autowired
    public void setService(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Cliente> findOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PostMapping
    public Cliente add(@RequestBody Cliente c) {
        return service.add(c);
    }

    @PutMapping(path = "/{id}")
    public Cliente update(@RequestBody Cliente c, @PathVariable Long id) {
        c.setId(id);
        return service.update(c);
    }

    @DeleteMapping(path = "{/id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
