
package com.fnlabs.mysql;

import java.sql.SQLException;

import redis.clients.jedis.Jedis;

public class RedisService {
	static Jedis jedis = new Jedis("redis-11828.c10.us-east-1-2.ec2.redns.redis-cloud.com",11828);
	

	private static RedisService _service;
	
    
	

	public static void main(String[] args) throws SQLException {
		jedis.auth("8bsbyheXv3c1bsxRefJkZhL9SHgVSTQZ");
	   jedis.set("Sampleone", "abc");
	   
	   
	   System.out.println("Vaue:"+ jedis.get("Sampleone"));
		
		//get();
	}

}
