package com.example.facebookapi.controllers;

import com.example.facebookapi.models.Post;
import com.example.facebookapi.models.Status;
import com.example.facebookapi.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin
@RestController
@RequestMapping("/api/status")
public class StatusController {
    @Autowired
    private StatusService statusService;
    @PostMapping("/save")
    public Status saveStatus(@RequestBody Status status) {
        return statusService.saveStatus(status);
    }

    @GetMapping("/getAllStatus")
    public ArrayList<Status> getAllStatus() {
        return statusService.getAllStatus();
    }


}
