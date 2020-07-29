package web.eaj.web.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Endereco {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String bairro;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @MapsId
    @JoinColumn(name = "cliente_id")
    Cliente cliente;

    public Endereco() {
    }

    public Endereco(Long id, String bairro, Cliente cliente) {
        this.id = id;
        this.bairro = bairro;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(id, endereco.id) &&
                Objects.equals(bairro, endereco.bairro) &&
                Objects.equals(cliente, endereco.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bairro, cliente);
    }
}
