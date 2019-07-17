package com.ray.service;

import com.ray.des.utils.DesResponse;

public interface DesService {

	public DesResponse testDes(String key, String securityMessage, String name, String password);
	
}
