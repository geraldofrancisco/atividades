package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.AtividadeDTO;
import com.sinquia.atividades.dto.MovimentoDTO;
import com.sinquia.atividades.dto.PessoaDTO;
import com.sinquia.atividades.mapper.MovimentoMapper;
import com.sinquia.atividades.model.Movimento;
import com.sinquia.atividades.repository.AtividadeRepository;
import com.sinquia.atividades.repository.MovimentoRepository;
import com.sinquia.atividades.repository.PessoaRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class MovimentoServiceTest {
    @Autowired
    MovimentoService service;

    @Autowired
    PessoaService pessoaService;

    @Autowired
    AtividadeService atividadeService;

    @Autowired
    MovimentoRepository repository;

    @Autowired
    PessoaRepository pessoaRepository;

    @Autowired
    AtividadeRepository atividadeRepository;

    @Test
    public void criarAtividadeTest() {
        PessoaDTO pessoa = new PessoaDTO(1L, "Geraldo", BigDecimal.TEN);
        this.pessoaService.adicionarPessoa(pessoa);

        AtividadeDTO atividade = new AtividadeDTO(1L,"atividade 1", 10);
        this.atividadeService.criarAtividade(atividade);

        MovimentoDTO movimento = new MovimentoDTO(1L, pessoa.getId(), atividade.getId());
        movimento = this.service.criarMovimento(movimento);
        Assert.assertTrue(movimento.getId() != null);
    }

    @AfterAll
    public void apagaMovimentosCriados() {
        this.pessoaRepository.deleteAll();
        this.atividadeRepository.deleteAll();
        this.repository.deleteAll();
    }
}
