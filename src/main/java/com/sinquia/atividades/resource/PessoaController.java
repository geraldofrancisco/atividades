package com.sinquia.atividades.resource;

import com.sinquia.atividades.service.PessoaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Pessoa")
@RequestMapping(name = "/api/pessoa")
public class PessoaController {

    @Autowired
    PessoaService service;

    @GetMapping("teste")
    @Operation(summary = "get teste", responses = {
            @ApiResponse(description = "testiculando", responseCode = "200",
                    content = @Content(schema = @Schema(implementation = String.class)))
    })
    public String teste() {
        return "teste";
    }
}
