package com.diksha.portal.service;

import java.util.List;

import com.diksha.portal.entity.NewUserRegistration;

public interface UserRegistration {

	public NewUserRegistration submit(NewUserRegistration nname2);

	public NewUserRegistration getDetails(int id);

	public List<NewUserRegistration> getAll();

	public NewUserRegistration update(NewUserRegistration userRegistration);

	public void deleteUserr(int i);
}
