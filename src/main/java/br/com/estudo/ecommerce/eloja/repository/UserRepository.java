package br.com.estudo.ecommerce.eloja.repository;

import br.com.estudo.ecommerce.eloja.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
}