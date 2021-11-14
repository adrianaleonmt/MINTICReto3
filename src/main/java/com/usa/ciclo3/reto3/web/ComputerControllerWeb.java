package com.usa.ciclo3.reto3.web;

import java.util.List;
import java.util.Optional;

import com.usa.ciclo3.reto3.model.Computer;
import com.usa.ciclo3.reto3.services.ComputerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Computer")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ComputerControllerWeb {

    @Autowired
    private ComputerServices computerServices;

    @GetMapping("/all")
    public List<Computer> getComputer(){

        return computerServices.getAll();
    }

    @GetMapping("/{idComputer}")
    public Optional<Computer> getComputer (@PathVariable("idComputer") int id) {

        return computerServices.getComputer(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer computer) {

        return computerServices.save(computer);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)

    public Computer update(@RequestBody Computer computer) {

        return computerServices.update(computer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return computerServices.deleteComputer(id);
    }


}
