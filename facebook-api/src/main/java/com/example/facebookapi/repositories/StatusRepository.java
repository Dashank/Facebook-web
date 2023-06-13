package com.example.facebookapi.repositories;

import com.example.facebookapi.models.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;
import com.example.facebookapi.models.Status;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface StatusRepository extends CassandraRepository<Status, UUID> {

    Status save(Status status);

    ArrayList<Status> findAll();
}
