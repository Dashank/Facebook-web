package com.example.facebookapi.services;
import com.example.facebookapi.models.Comment;
import com.example.facebookapi.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Date;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    public Comment saveComment(Comment comment) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        comment.setCommentID(UUID.randomUUID());
        comment.setTimestamp(dateTime);
        return commentRepository.save(comment);
    }

    public ArrayList<Comment> getComments(UUID postID) {
        return commentRepository.findAllByPostID(postID);
    }
}
