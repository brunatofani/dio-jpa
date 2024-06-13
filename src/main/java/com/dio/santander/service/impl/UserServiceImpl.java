package com.dio.santander.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.model.Address;
import com.dio.santander.model.User;
import com.dio.santander.repositories.AddressRepository;
import com.dio.santander.repositories.UserRepository;
import com.dio.santander.service.AddressService;
import com.dio.santander.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    AddressService addressService;

    @Override
    public Iterable<User> getAll() {
       return userRepository.findAll();
    }

    @Override
    public User betByID(Long id) {
        Optional<User> cliente = userRepository.findById(id);
		return cliente.get();
    }

    @Override
    public void insert(User user) {
        userRepository.save(verifyAddress(user));
    }

    @Override
    public void update(Long id, User user) {
        Optional<User> userData = userRepository.findById(id);
		if (userData.isPresent()) {
			insert(user);
		}
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public User verifyAddress(User user) {
        String cep = user.getAddress().getCep();
		Address newAddress = addressRepository.findById(cep)orElseGet(() -> {
            Address newAddress = addressService.verifyCep(cep);
			addressRepository.save(newAddress);
            return newAddress;
        });
		user.setAddress(newAddress);
        return user;
    }
}
