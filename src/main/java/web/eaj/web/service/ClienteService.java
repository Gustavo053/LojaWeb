package web.eaj.web.service;

import com.mysql.cj.xdevapi.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.eaj.web.models.Cliente;
import web.eaj.web.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private ClienteRepository repository;

    @Autowired
    public void setRepository(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente add(Cliente c) {
        return repository.save(c);
    }

    public Cliente update(Cliente c) {
        return repository.save(c);
    }

    public void delete(Cliente c) {
        repository.delete(c);
    }

    public void deleteById(Long id) { repository.deleteById(id); }

    public Cliente findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Optional<Cliente> findById(Long id) { return repository.findById(id); }

    public List<Cliente> findAll() {
        return repository.findAll();
    }
}
