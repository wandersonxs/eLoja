package br.com.estudo.ecommerce.eloja.repository;

import br.com.estudo.ecommerce.eloja.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Endereco, Long> {
}