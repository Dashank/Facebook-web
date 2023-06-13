package com.example.facebookapi.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Table("status")
@Getter
@Setter
public class Status {
    @PrimaryKey
    private UUID statusID;

    private String userID;

    private String statusImageUrl;

    private Timestamp uploadTime;

    public Status() {
        super();
    }
    public Status(UUID statusID, String userID, String statusImageUrl, Timestamp uploadTime) {
        super();
        this.statusID = statusID;
        this.userID = userID;
        this.statusImageUrl = statusImageUrl;
        this.uploadTime = uploadTime;
    }
}
