package com.diksha.portal.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diksha.portal.entity.NewUserRegistration;
import com.diksha.portal.repositary.registerRepository;
import com.diksha.portal.service.UserRegistration;

@Service
@Transactional
public class UserRegistrationServiceimpl implements UserRegistration {
	@Autowired
	registerRepository repository;

	@Override
	public NewUserRegistration submit(NewUserRegistration name) {
		return repository.save(name);
	}

	@Override
	public NewUserRegistration getDetails(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<NewUserRegistration> getAll() {
		return repository.findAll();
	}

	@Override
	public NewUserRegistration update(NewUserRegistration userRegistration) {
		return repository.save(userRegistration);
	}

	@Override
	public void deleteUserr(int i) {
		repository.deleteById(i);
	}
}
