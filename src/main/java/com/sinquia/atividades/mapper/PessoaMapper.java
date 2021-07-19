package com.sinquia.atividades.mapper;

import com.sinquia.atividades.dto.PessoaDTO;
import com.sinquia.atividades.model.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {
}
