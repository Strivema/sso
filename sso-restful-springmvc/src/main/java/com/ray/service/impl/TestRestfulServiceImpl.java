package com.ray.service.impl;

import org.springframework.stereotype.Service;

import com.ray.service.TestRestfulService;

@Service
public class TestRestfulServiceImpl implements TestRestfulService {

	@Override
	public String queryUserById(Long id) {
		System.out.println("queryUserById : " + id);
		return "{id:"+id+", name:admin}";
	}

	@Override
	public void saveUser(String user) {
		System.out.println("saveUser : " + user);
	}

	@Override
	public void updateUser(String user) {
		System.out.println("updateUser : " + user);
	}

	@Override
	public void deleteUserById(Long id) {
		System.out.println("deleteUserById : " + id);
	}

}
