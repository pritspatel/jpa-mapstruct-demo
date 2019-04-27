package com.prits.mapper;

import com.prits.dto.PostDto;
import com.prits.entity.Post;
import com.prits.entity.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
public class PostMapperTest {
    @Test
    public void entityToDto() throws Exception {
        //create tags

        Tag t1 = new Tag();
        t1.setName("tag1");

        Tag t2 = new Tag();
        t2.setName("tag2");

        Tag t3 = new Tag();
        t3.setName("tag3");

        List<Tag> tags1 = Arrays.asList(t1, t2);
        List<Tag> tags2 = Arrays.asList(t2, t3);

        //set post 1
        Post p1 = new Post();
        p1.setTitle("Title 1 of post 1");
        //p1.setTags(tags1);
        p1.getTags().add(t1);
        p1.getTags().add(t2);

        PostDto postDto = PostMapper.INSTANCE.entityToDto(p1);
        Assert.assertNotNull(postDto);
        Assert.assertNotNull(postDto.getTagDtos());
        Assert.assertTrue(postDto.getTagDtos().size() == 2);
    }

    @Test
    public void baseDtoTest() throws Exception {
        //set post 1
        Post p1 = new Post();
        p1.setTitle("Title 1 of post 1");

        PostDto postDto = PostMapper.INSTANCE.entityToDto(p1);
        Assert.assertNotNull(postDto);
        Assert.assertNotNull(postDto.getTagDtos());
        Assert.assertTrue(postDto.getTagDtos().size() == 0);
    }
    @Test
    public void entityListToDtoList() throws Exception {

    }

}