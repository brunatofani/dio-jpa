package com.dio.santander.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.santander.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}