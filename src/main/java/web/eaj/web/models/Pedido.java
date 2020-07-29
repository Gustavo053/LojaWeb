package web.eaj.web.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String data;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id")
    List<Cliente> clientes;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    List<Produto> produtos;

    public Pedido() {
    }

    public Pedido(Long id, String data, List<Cliente> clientes, List<Produto> produtos) {
        this.id = id;
        this.data = data;
        this.clientes = clientes;
        this.produtos = produtos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idPedido) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Cliente> getCliente() {
        return clientes;
    }

    public void setCliente(Cliente cliente) {
        this.clientes = clientes;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
