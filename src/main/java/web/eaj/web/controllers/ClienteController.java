package web.eaj.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.eaj.web.models.Cliente;
import web.eaj.web.service.ClienteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
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
    public Cliente findOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PostMapping
    public Cliente add(@RequestBody Cliente c) {
        return service.add(c);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Cliente> update(@RequestBody Cliente c, @PathVariable Long id) {
        if (service.findOne(id) == null) {
            return ResponseEntity.notFound().build();
        } else {
            c.setId(id);
            service.update(c);
            Cliente updated = service.findOne(id);
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
