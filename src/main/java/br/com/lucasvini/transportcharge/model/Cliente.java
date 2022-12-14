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
public class Cliente {

    @Id
    private String id;
    private String cnpj;
    private String fantasyName;
    private String cep;
    private String segment;

}
