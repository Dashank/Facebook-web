package com.example.facebookapi.repositories;

import com.example.facebookapi.models.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface PostRepository extends CassandraRepository<Post, UUID> {

    Post save(Post post);

    ArrayList<Post> findAll();

    void deleteByPostID(UUID postID);

}
