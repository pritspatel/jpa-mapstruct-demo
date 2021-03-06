package com.prits.service;

import com.prits.dto.BasePostDto;
import com.prits.dto.PostDto;
import com.prits.entity.Post;
import com.prits.mapper.BasePostMapper;
import com.prits.mapper.PostMapper;
import com.prits.repo.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Service
@Slf4j
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<PostDto> finaAllPosts() {
        log.info("Loading all posts");
        Iterable<Post> posts = postRepository.findAll();
        List<PostDto> postDtoList = PostMapper.INSTANCE.entityListToDtoList((List<Post>) posts);
        return postDtoList;
    }

    public List<BasePostDto> loadBasePosts() {
        log.info("Loading all base posts without childs");
        Iterable<Post> posts = postRepository.findAll();
        List<BasePostDto> basePostDtos = BasePostMapper.INSTANCE.toDtoList((List<Post>) posts);
        return basePostDtos;
    }
}
