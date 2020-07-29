package web.eaj.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.eaj.web.models.Pedido;
import web.eaj.web.repository.PedidoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    PedidoRepository repository;

    @Autowired
    public void setRepository(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido add(Pedido p) {
        return repository.save(p);
    }

    public Pedido update(Pedido p) {
        return repository.save(p);
    }

    public void delete(Pedido p) {
        repository.delete(p);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Pedido findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Optional<Pedido> findById(Long id) { return repository.findById(id); }

    public List<Pedido> findAll() {
        return repository.findAll();
    }
}
