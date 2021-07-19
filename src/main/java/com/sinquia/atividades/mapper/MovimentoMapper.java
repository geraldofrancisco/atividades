package com.sinquia.atividades.mapper;

import com.sinquia.atividades.dto.MovimentoDTO;
import com.sinquia.atividades.model.Movimento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovimentoMapper  extends EntityMapper<MovimentoDTO, Movimento> {
}
