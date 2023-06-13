package com.example.facebookapi.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.sql.Timestamp;

import java.util.UUID;

@Table("users")
@Getter
@Setter
public class User {


    @PrimaryKey
    private String userID;

    private String userName;

    private String userImage;

    private boolean active;

    private Timestamp joiningDate;

    public User() {
        super();
    }
    public User(String userID, String userName, String userImage, boolean active, Timestamp joiningDate) {
        super();
        this.userID = userID;
        this.userName = userName;
        this.userImage = userImage;
        this.active = active;
        this.joiningDate = joiningDate;
    }
}
