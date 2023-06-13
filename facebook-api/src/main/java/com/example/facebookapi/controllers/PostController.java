package com.example.facebookapi.controllers;

import com.example.facebookapi.models.Post;
import com.example.facebookapi.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;
@CrossOrigin
@RestController
@RequestMapping("/api/post")
public class PostController {
    @Autowired
    PostService postService;



    @PostMapping("/save")
    public ArrayList<Post> savePost(@RequestBody Post body) {
        ArrayList<Post> response = postService.savePost(body);
        return response;
    }

    @GetMapping("/getPost")
    public ArrayList<Post> getPosts() {
        ArrayList<Post> response = postService.getPosts();
        return response;
    }

    @DeleteMapping("/delete/{postId}")
    public ArrayList<Post> deletePost(@PathVariable("postId") UUID postID) {
        ArrayList<Post> response = postService.deletePost(postID);
        return response;
    }
}
