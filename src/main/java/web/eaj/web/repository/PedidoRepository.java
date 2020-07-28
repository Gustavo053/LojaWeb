package web.eaj.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.eaj.web.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
