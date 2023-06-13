package com.example.facebookapi.repositories;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import com.example.facebookapi.models.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface CommentRepository extends CassandraRepository<Comment, UUID> {
    Comment save(Comment comment);
    @AllowFiltering
    ArrayList<Comment> findAllByPostID(UUID postID);
}
