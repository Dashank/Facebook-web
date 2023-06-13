package com.example.facebookapi.services;

import com.example.facebookapi.models.Post;
import com.example.facebookapi.models.Status;
import com.example.facebookapi.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;
import java.util.Date;
import java.sql.Timestamp;
@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;
    public Status saveStatus(Status status) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        status.setStatusID(UUID.randomUUID());
        status.setUploadTime(dateTime);

        return statusRepository.save(status);
    }

    public ArrayList<Status> getAllStatus() {

        return statusRepository.findAll();
    }

}
