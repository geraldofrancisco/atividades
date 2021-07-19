package com.sinquia.atividades.mapper;

import com.sinquia.atividades.dto.AtividadeDTO;
import com.sinquia.atividades.model.Atividade;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AtividadeMapper extends EntityMapper<AtividadeDTO, Atividade>{
}
