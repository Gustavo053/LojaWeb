package web.eaj.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.eaj.web.models.Pedido;
import web.eaj.web.service.PedidoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedido")
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
public class PedidoController {
    PedidoService service;

    @Autowired
    public void setService(PedidoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pedido> findAll() {
        return service.findAll();
    }

    @GetMapping(path = "/{id}")
    public Pedido findOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PostMapping
    public Pedido add(@RequestBody Pedido p) {
        return service.add(p);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Pedido> update(@RequestBody Pedido p, @PathVariable Long id) {
        if (service.findOne(id) == null) {
            return ResponseEntity.notFound().build();
        } else {
            p.setId(id);
            Pedido updated = service.findOne(id);
            return ResponseEntity.ok(updated);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return service
                .findById(id)
                .map(record -> {
                    service.delete(record);
                    return ResponseEntity.status(202).build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
