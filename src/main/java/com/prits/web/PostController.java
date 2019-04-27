package com.prits.web;

import com.prits.dto.BasePostDto;
import com.prits.dto.PostDto;
import com.prits.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
@RestController
@Slf4j
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/allPosts")
    public List<PostDto> loadAllPosts() {
        log.info("Service allPosts request");
        return postService.finaAllPosts();
    }

    @RequestMapping("/basePosts")
    public List<BasePostDto> loadBasePosts() {
        log.info("Service allPosts request");
        return postService.loadBasePosts();
    }
}
