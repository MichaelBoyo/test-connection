package com.privateconnection.privateconnection;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostRepo postRepo;

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {
        return postRepo.save(post);
    }

    @GetMapping
    public Iterable<Post> getPosts() {
        return postRepo.findAll();
    }

}
