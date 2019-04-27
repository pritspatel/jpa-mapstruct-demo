package com.prits.mapper;

import com.prits.dto.TagDto;
import com.prits.entity.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Mapper
public interface TagMapper {
    TagMapper INSTANCE = Mappers.getMapper(TagMapper.class);

    TagDto entityToDto(Tag tag);

    List<TagDto> entityListToDtoList(List<Tag> tags);

}
