package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//without RepositoryRestResource we need to specify endpoints and code different functions
//generally Repository interface is to access data from database
//we are using this annotation because, in before examples we used controller class(different endpoints for different requests)
//here we do not need that, restrepository can automatically handle all api requests and fetch data from the database
//arguments specify from where the data has to be extracted, all our urls will work on path customers
//with this annotation, we need not specify /{1} also, we can directly give /1 in the url without having separate function for it
@RepositoryRestResource(collectionResourceRel="customers", path="customers")
public interface CustomerRepo extends JpaRepository<Customers, Integer> {

}
 