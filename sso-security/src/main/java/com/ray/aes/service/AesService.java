package com.ray.aes.service;

import com.ray.aes.utils.AesResponse;

public interface AesService {

	public AesResponse testAes(String key, String securityMessage, String name, String password);
	
}
