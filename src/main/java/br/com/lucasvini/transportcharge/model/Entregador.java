package br.com.lucasvini.transportcharge.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
@Builder
public class Entregador {

    @Id
    private String id;
    private String cpf;
    private String nome;
    private String cep;
    private String veiculo;


}
