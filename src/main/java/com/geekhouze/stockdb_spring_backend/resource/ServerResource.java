package com.geekhouze.stockdb_spring_backend.resource;


import com.geekhouze.stockdb_spring_backend.model.Server;
import com.geekhouze.stockdb_spring_backend.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/server")
public class ServerResource {

    @Autowired
    private ServerRepository serverRepository;


    @GetMapping(name ="/")
    public List<Server> getServer(){
        return serverRepository.findAll();
    }

    public List<Server>addServer(@RequestBody Server server){
        serverRepository.save(server);
        return serverRepository.findAll();
    }

}
