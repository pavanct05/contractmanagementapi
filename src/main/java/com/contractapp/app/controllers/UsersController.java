package com.contractapp.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contractapp.app.models.Users;
import com.contractapp.app.repositories.UsersRepository;


@RestController
@RequestMapping(value= "/")
public class UsersController {
	
	
	@Autowired
	private UsersRepository repository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Users> getAllUsers() {
	  return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Users getUsersById(@PathVariable(value = "id") ObjectId id) {
	  return repository.findBy_id(id);
	}
	
	 @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifyUsersById(@PathVariable(value = "id") ObjectId id, @Valid @RequestBody Users users) {
	    users.set_id(id);
	    repository.save(users);
	  }
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public Users createPet(@Valid @RequestBody Users users) {
	    users.set_id(ObjectId.get());
	    repository.save(users);
	    return users;
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deleteUsers(@PathVariable ObjectId id) {
		  repository.delete(repository.findBy_id(id));
	  }
}
