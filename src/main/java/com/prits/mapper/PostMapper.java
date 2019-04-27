package com.prits.mapper;

import com.prits.dto.PostDto;
import com.prits.dto.TagDto;
import com.prits.entity.Post;
import com.prits.entity.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Mapper
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(source = "post.tags", target = "tagDtos")
    PostDto entityToDto(Post post);


    List<PostDto> entityListToDtoList(List<Post> posts);

    //Post dtoToEntity(PostDto postDto);

    //List<Post> dtoListToEntityList(List<PostDto> postDtos);

    TagDto entityToDto(Tag tag);

    List<TagDto> tagEntityListToDtoList(List<Tag> tags);

}
