package com.demo.service;

import java.util.List;

import com.demo.entity.Authority;

public interface AuthorityService {

	List<Authority> findAll();

	Authority create(Authority auth);

	void delete(Integer id);

	List<Authority> findAuthoritiesOfAdministrators();

	void register(String username);

}
