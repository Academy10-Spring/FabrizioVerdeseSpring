package com.example.userList.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.userList.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
