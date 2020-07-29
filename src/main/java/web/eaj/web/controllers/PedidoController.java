package web.eaj.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Optional<Pedido> findOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PostMapping
    public Pedido add(@RequestBody Pedido p) {
        return service.add(p);
    }

    @PutMapping(path = "/{id}")
    public Pedido update(@RequestBody Pedido p, @PathVariable Long id) {
        p.setIdPedido(id);
        return service.update(p);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
