package br.com.estudo.ecommerce.eloja.repository;


import br.com.estudo.ecommerce.eloja.domain.Endereco;
import br.com.estudo.ecommerce.eloja.domain.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void givenUserWhenInsertThenReturnUserCreated(){
        // GIVEN
        Endereco address = Endereco.builder().endereco("Rua dos Operários").cidade("Jacareí").build();
        Usuario user = Usuario.builder().nome("Stephany").email("stephany@gmail.com").senha("abc").build();

        // WHEN
        Usuario userSaved = userRepository.save(user);

        // THEN
        Assert.isTrue(userSaved.getId() != null, "Não salvou user");
    }

    @Test
    public void givenUserIdWhenFindByIdThenReturnUser(){
        // GIVEN
        Long userId = 1L;
        // WHEN
        Usuario usuario = userRepository.findById(userId).get();

        // THEN
        Assert.isTrue(usuario.getId() != null, "Não salvou user");
    }


    @Test
    public void givenUserIdWhenFindByIdThenReturnPedidoComProdutos(){
        // GIVEN
        Long userId = 1L;
        // WHEN
        Usuario usuario = userRepository.findById(userId).get();

        usuario.getPedidos().forEach( pedido -> {
            pedido.getProdutos().forEach(produto -> {
                System.out.println(produto.toString());
            });
        });

        // THEN
        Assert.isTrue(usuario.getId() != null, "Não salvou user");
    }


}
