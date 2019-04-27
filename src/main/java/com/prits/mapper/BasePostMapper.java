package com.prits.mapper;

import com.prits.dto.BasePostDto;
import com.prits.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Mapper
public interface BasePostMapper {
    BasePostMapper INSTANCE = Mappers.getMapper(BasePostMapper.class);

    BasePostDto toDto(Post post);

    List<BasePostDto> toDtoList(List<Post> posts);
}
