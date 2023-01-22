package com.attornatus.backend.repository;


import com.attornatus.backend.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Pessoa findByNumeroCadastro(String numeroCadastro);

}
