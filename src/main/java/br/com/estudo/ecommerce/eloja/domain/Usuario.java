package br.com.estudo.ecommerce.eloja.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String senha;

    @OneToOne(mappedBy = "usuario")
    private Endereco endereco;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private List<Pedido> pedidos;

}
