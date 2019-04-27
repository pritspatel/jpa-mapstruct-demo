package com.prits.service;

import com.prits.dto.PostDto;
import com.prits.entity.Post;
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
}
