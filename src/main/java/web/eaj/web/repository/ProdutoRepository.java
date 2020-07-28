package web.eaj.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.eaj.web.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
