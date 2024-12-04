package com.EVENT.EVENT.Controller;


import com.EVENT.EVENT.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private  EventRepository eventRepository;



}
