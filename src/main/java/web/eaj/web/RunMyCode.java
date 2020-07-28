package web.eaj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import web.eaj.web.models.Cliente;
import web.eaj.web.models.Endereco;
import web.eaj.web.models.Pedido;
import web.eaj.web.models.Produto;
import web.eaj.web.repository.ClienteRepository;
import web.eaj.web.repository.EnderecoRepository;
import web.eaj.web.repository.PedidoRepository;
import web.eaj.web.repository.ProdutoRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class RunMyCode implements ApplicationRunner {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    EnderecoRepository enderecoRepository;
    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
//        Cliente c1 = new Cliente();
//        Endereco e1 = new Endereco();
//        Pedido p1 = new Pedido();
//
//        c1.setNome("Luan Fonseca");
//        c1.setEmail("luanfonceca@gmail.com");
//
//        e1.setBairro("potengi - zn");
//        e1.setCliente(c1);
//
//        List<Produto> produtos = new ArrayList<>();
//
//        Produto pro1 = new Produto();
//        pro1.setNome("Macbook");
//        pro1.setCategoria("Computadores");
//
//        produtos.add(pro1);
//        p1.setCliente(c1);
//        p1.setData("02/09/1999");
//        p1.setProdutos(produtos);
//
//        enderecoRepository.save(e1);
//        pedidoRepository.save(p1);

    }
}
