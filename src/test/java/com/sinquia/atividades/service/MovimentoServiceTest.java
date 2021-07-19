package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.AtividadeDTO;
import com.sinquia.atividades.dto.MovimentoDTO;
import com.sinquia.atividades.dto.PessoaDTO;
import com.sinquia.atividades.exception.RegraNegocioException;
import com.sinquia.atividades.mapper.AtividadeMapper;
import com.sinquia.atividades.mapper.MovimentoMapper;
import com.sinquia.atividades.mapper.PessoaMapper;
import com.sinquia.atividades.repository.AtividadeRepository;
import com.sinquia.atividades.repository.MovimentoRepository;
import com.sinquia.atividades.repository.PessoaRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class MovimentoServiceTest {
    @Autowired
    MovimentoService service;

    @Autowired
    MovimentoRepository repository;

    @Autowired
    PessoaRepository pessoaRepository;

    @Autowired
    AtividadeRepository atividadeRepository;

    @Autowired
    MovimentoMapper mapper;

    @Autowired
    PessoaMapper pessoaMapper;

    @Autowired
    AtividadeMapper atividadeMapper;

    @Test
    public void criarAtividadeTest() {

        PessoaDTO pessoa = new PessoaDTO(1L, "Geraldo", BigDecimal.TEN);
        this.pessoaRepository.save(this.pessoaMapper.toEntity(pessoa));

        AtividadeDTO atividade = new AtividadeDTO(1L,"atividade 1", 10);
        this.atividadeRepository.save(this.atividadeMapper.toEntity(atividade));

        MovimentoDTO movimento = new MovimentoDTO(1L, pessoa.getId(), atividade.getId());
        movimento = this.service.criarMovimento(movimento);
        Assert.assertTrue(movimento.getId() != null);
    }

    @Test(expected = RegraNegocioException.class)
    public void deveDarErroMovimentoEmExecucaoTest() {

        PessoaDTO pessoa = new PessoaDTO(2L, "João", BigDecimal.TEN);
        this.pessoaRepository.save(this.pessoaMapper.toEntity(pessoa));

        AtividadeDTO atividade = new AtividadeDTO(2L,"atividade 2", 10);
        this.atividadeRepository.save(this.atividadeMapper.toEntity(atividade));

        MovimentoDTO movimento = new MovimentoDTO(2L, pessoa.getId(), atividade.getId());
        movimento.setInicio(LocalDateTime.now());
        this.repository.save(this.mapper.toEntity(movimento));

        PessoaDTO pessoa2 = new PessoaDTO(3L, "Marlon", BigDecimal.ONE);
        this.pessoaRepository.save(this.pessoaMapper.toEntity(pessoa2));

        AtividadeDTO atividade2 = new AtividadeDTO(3L,"atividade 3", 17);
        this.atividadeRepository.save(this.atividadeMapper.toEntity(atividade2));

        MovimentoDTO movimento2 = new MovimentoDTO(3L, pessoa2.getId(), atividade2.getId());
        this.service.criarMovimento(movimento2);
    }

    @After
    public void apagaMovimentosCriados() {
        this.repository.deleteAll();
        this.pessoaRepository.deleteAll();
        this.atividadeRepository.deleteAll();
    }
}
