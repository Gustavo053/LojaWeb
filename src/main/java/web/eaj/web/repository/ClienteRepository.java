package web.eaj.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.eaj.web.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
