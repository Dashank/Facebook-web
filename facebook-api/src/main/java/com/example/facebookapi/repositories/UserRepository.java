package com.example.facebookapi.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import com.example.facebookapi.models.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.UUID;
@Repository
public interface UserRepository extends CassandraRepository<User, String> {

    User save(User user);

    ArrayList<User> findAll();

    User findAllByUserID(String userID);

}
