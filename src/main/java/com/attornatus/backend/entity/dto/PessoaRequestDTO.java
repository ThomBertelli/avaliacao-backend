package com.attornatus.backend.entity.dto;

import com.attornatus.backend.entity.Endereco;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PessoaRequestDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private Date dataNascimento;

    
    private List<Endereco> enderecos = new ArrayList<>();
    @NotBlank
    private Endereco enderecoPrincipal;

    
    private String numeroCadastro;

}
