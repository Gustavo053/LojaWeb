package web.eaj.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.eaj.web.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
