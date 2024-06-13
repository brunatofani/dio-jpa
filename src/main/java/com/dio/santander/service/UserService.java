package com.dio.santander.service;

import com.dio.santander.model.User;

public interface UserService {
    Iterable<User> getAll();

	User betByID(Long id);

	void insert(User user);

	void update(Long id, User user);

	void delete(Long id);
}