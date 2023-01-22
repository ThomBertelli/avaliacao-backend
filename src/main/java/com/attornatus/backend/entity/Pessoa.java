package com.attornatus.backend.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.*;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Date dataNascimento;

    @OneToMany
    @ToString.Exclude
    private List<Endereco> enderecos = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco enderecoPrincipal;

    @Column(nullable = false, unique = true)
    private String numeroCadastro;

    public void setNumeroCadastro() {
        this.numeroCadastro = UUID.randomUUID().toString();
    }

    public void setEnderecoPrincipal(Endereco endereco){
        this.enderecoPrincipal = endereco;
        if (!enderecos.contains(endereco)) {
            enderecos.add(endereco);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pessoa pessoa = (Pessoa) o;
        return id != null && Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}