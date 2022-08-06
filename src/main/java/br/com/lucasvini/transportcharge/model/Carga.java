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
public class Carga {

    @Id
    private String codRastreio;
    private Long peso;
    private String preco;
    private String destino;
    private String descricao;
    private Entregador entregador;
    private Cliente cliente;

}
