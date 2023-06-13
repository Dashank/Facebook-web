package com.example.facebookapi.models;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.sql.Timestamp;
import java.util.UUID;

@Table("posts")
@Getter
@Setter
public class Post {


    @PrimaryKey
    private UUID postID;

    private String userID;

    private String userName;

    private String imageUrl;

    private String description;

    private String postImgUrl;
    private int likes;

    private Timestamp dateTime;

    public Post() { super(); }

    public Post(UUID postID, String userID, String userName, String imageUrl, String description, String postImgUrl, int likes, Timestamp dateTime) {
        this.postID = postID;
        this.userID = userID;
        this.userName = userName;
        this.imageUrl = imageUrl;
        this.description = description;
        this.postImgUrl = postImgUrl;
        this.likes = likes;
        this.dateTime = dateTime;
    }
}
