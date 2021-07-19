package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.AtividadeDTO;
import com.sinquia.atividades.model.Atividade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class AtividadeServiceTest {

    @Autowired
    AtividadeService service;

    @Test
    public void criarAtividadeTest() {
        AtividadeDTO atividade = new AtividadeDTO(null,"atividade 1", 10);
        atividade = this.service.criarAtividade(atividade);
        Assert.assertTrue(atividade.getId() != null);
    }
}
