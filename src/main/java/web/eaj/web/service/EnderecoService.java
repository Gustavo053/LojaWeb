package web.eaj.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.eaj.web.models.Endereco;
import web.eaj.web.repository.EnderecoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    EnderecoRepository repository;

    @Autowired
    public void setRepository(EnderecoRepository repository) {
        this.repository = repository;
    }

    public Endereco add(Endereco e) {
        return repository.save(e);
    }

    public Endereco update(Endereco e) {
        return repository.save(e);
    }

    public void delete(Endereco e) {
        repository.delete(e);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Endereco findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Optional<Endereco> findById(Long id) {
        return repository.findById(id);
    }

    public List<Endereco> findAll() {
        return repository.findAll();
    }
}
