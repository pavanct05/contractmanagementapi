package com.contractapp.app.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.contractapp.app.models.Users;
@Repository
public interface UsersRepository extends MongoRepository<Users, String> {
	  com.contractapp.app.models.Users findBy_id(ObjectId _id);
	}
