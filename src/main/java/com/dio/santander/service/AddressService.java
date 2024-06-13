package com.dio.santander.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dio.santander.model.Address;


@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface AddressService {

	@GetMapping("/{cep}/json/")
	Address verifyCep(@PathVariable("cep") String cep);
}