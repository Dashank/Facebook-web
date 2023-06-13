package com.example.facebookapi.controllers;
import com.example.facebookapi.models.Comment;
import com.example.facebookapi.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;
@CrossOrigin
@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @PostMapping("/save")
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @GetMapping("/getComments/{postId}")
    public ArrayList<Comment> getComment(@PathVariable("postId") UUID postID) {
        return commentService.getComments(postID);
    }
}
