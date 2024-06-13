package com.dio.santander.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.santander.model.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    public Address findById(String cep);

}