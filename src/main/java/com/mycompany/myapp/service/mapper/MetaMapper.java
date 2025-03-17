package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Aluno;
import com.mycompany.myapp.domain.Meta;
import com.mycompany.myapp.service.dto.AlunoDTO;
import com.mycompany.myapp.service.dto.MetaDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Meta} and its DTO {@link MetaDTO}.
 */
@Mapper(componentModel = "spring")
public interface MetaMapper extends EntityMapper<MetaDTO, Meta> {
    @Mapping(target = "aluno", source = "aluno", qualifiedByName = "alunoId")
    MetaDTO toDto(Meta s);

    @Named("alunoId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    AlunoDTO toDtoAlunoId(Aluno aluno);
}
