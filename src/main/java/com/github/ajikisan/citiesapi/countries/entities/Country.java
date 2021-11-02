package com.github.ajikisan.citiesapi.countries.entities;
//Toda API de JPA - traz ferrramentas como tipo Hybernate - Usando framework spring
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*mapear todas as colunas do banco de dados para este classe Country - No Ubuntu cities# /d país;*/
@Entity(name = "Country")
@Table(name = "pais")

public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;

    @Column(name = "sigla")
    private String code;

    private Integer bacen; /* quando o nome for igual a coluna não é necessário mapear a entidade */

    /*alt+ insert comando para criar construtor*/

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}


