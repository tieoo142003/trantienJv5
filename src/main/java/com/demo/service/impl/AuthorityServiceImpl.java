package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Account;
import com.demo.entity.Authority;
import com.demo.repository.AccountRepo;
import com.demo.repository.AuthorityRepo;
import com.demo.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityRepo authorityRepo;
	
	@Autowired
	private AccountRepo accountRepo;
	
	@Override
	public List<Authority> findAll() {
		return authorityRepo.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return authorityRepo.save(auth);
	}

	@Override
	public void delete(Integer id) {
		authorityRepo.deleteById(id);
	}

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = accountRepo.getAdministrators();
		return authorityRepo.authoritiesOf(accounts);
	}

	@Override
	@Transactional
	public void register(String username) {
		authorityRepo.register(username);
	}

}
