package com.github.ajikisan.citiesapi.countries.resources;
//Realizar a API Rest - quanto métodos e recursos

import com.github.ajikisan.citiesapi.countries.entities.Country;
import com.github.ajikisan.citiesapi.countries.repositories.CountryRepository;
/*import net.bytebuddy.asm.Advice;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;*/
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController   //Spring entende que é o controler rest
@RequestMapping("/countries")  //Quando for executado o GET irá retornar a lista de países do Banco de dados.

public class CountryResource<id> {

    /*@Autowired - injeta o repositório para funcionar */
    /* Como alternativa clicar en CountryResource para criar construtor para que realize a ação de chamar*/

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {

        this.repository = repository;
    }

    //Faz o mapeamento dos dados da tabela País conforme https://pt.wikipedia.org/wiki/Hypertext_Transfer_Protocol

    @GetMapping("/countries")
    public List<Country> countries() {
        //Alt + enter - em cima da palavra repository para selecionar a variável local
        return repository.findAll();
    }

    @GetMapping ("/id")
    public Country getOne(@PathVariable Long id) {
        Optional<Country> optional = repository.findById(id);
        return optional.get();
    }
    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }
}