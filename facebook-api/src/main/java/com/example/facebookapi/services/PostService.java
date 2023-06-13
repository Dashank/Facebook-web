package com.example.facebookapi.services;

import com.example.facebookapi.models.Post;
import com.example.facebookapi.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;
import java.util.Date;
import java.sql.Timestamp;
@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public ArrayList<Post> savePost(Post post) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        post.setPostID(UUID.randomUUID());
        post.setLikes(0);
        post.setDateTime(dateTime);
        postRepository.save(post);
        ArrayList<Post> posts = getPosts();
        return posts;

    }

    public ArrayList<Post> getPosts() {
        ArrayList<Post> posts = postRepository.findAll();
        return posts;
    }

    public ArrayList<Post> deletePost(UUID postID) {

        postRepository.deleteByPostID(postID);
        ArrayList<Post> posts = getPosts();
        return posts;

    }
}
