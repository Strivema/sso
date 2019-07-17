package com.ray.service;

public interface TestRestfulService {

	String queryUserById(Long id);

	void saveUser(String user);

	void updateUser(String user);

	void deleteUserById(Long id);

}
