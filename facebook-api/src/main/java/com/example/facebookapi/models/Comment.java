package com.example.facebookapi.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Table("comments")
@Getter
@Setter
public class Comment {
    @PrimaryKey
    private UUID commentID;

    private String userID;

    private UUID postID;

    private String comment;

    private String userName;
    private String userImage;
    private Timestamp timestamp;

    public Comment() {
        super();
    }

    public Comment(UUID commentID, String userID, UUID postID, String comment, String userName, String userImage, Timestamp timestamp) {
        this.commentID = commentID;
        this.userID = userID;
        this.postID = postID;
        this.comment = comment;
        this.userName = userName;
        this.userImage = userImage;
        this.timestamp = timestamp;
    }
}
