package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.PessoaDTO;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class PessoaServiceTest {

    @Autowired
    PessoaService service;

    @Test
    public void criarPessoaTest() {
        PessoaDTO pessoa = new PessoaDTO(null, "Geraldo", BigDecimal.TEN);
        pessoa = this.service.adicionarPessoa(pessoa);

        Assert.assertTrue(pessoa.getId() != null);
    }
}
