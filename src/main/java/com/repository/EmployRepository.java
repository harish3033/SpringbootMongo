package com.repository;

import com.model.Employ;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployRepository extends MongoRepository<Employ,String>{

    public Employ findOneByName(String name);


}
