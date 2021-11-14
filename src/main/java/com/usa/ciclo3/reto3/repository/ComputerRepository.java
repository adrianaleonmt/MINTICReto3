package com.usa.ciclo3.reto3.repository;
import java.util.List;
import java.util.Optional;

import com.usa.ciclo3.reto3.crudrepository.ComputerCrudRepository;
import com.usa.ciclo3.reto3.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author USUARIO
 */
@Repository
public class ComputerRepository {


        @Autowired
        private ComputerCrudRepository computerCrudRepository;

        public List<Computer> getAll(){

            return (List<Computer>) computerCrudRepository.findAll();
        }

        public Optional<Computer> getComputer(int id){

            return computerCrudRepository.findById(id);
        }

        public Computer save(Computer computer){

            return computerCrudRepository.save(computer);
        }
        public void delete(Computer computer){

            computerCrudRepository.delete(computer);
        }

    }
