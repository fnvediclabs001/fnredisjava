
package com.fnlabs.mysql;

import java.sql.SQLException;

import redis.clients.jedis.Jedis;

public class RedisService {
	 Jedis jedis;
	
	 
	private static RedisService _service;
	static int REDIS_PORT = 0;
    public static RedisService getInstsance() {
    	if(_service == null) {
    		_service = new RedisService();
    		_service.jedis =  new Jedis( "{{REDIS_URL}}"  , REDIS_PORT);
    		_service.jedis.auth("{{REDIS_AUTH_KEY}}"); 
    	}
    	
    	return _service;
    }
    
   
    public void set(String key, String value) {
    	//ADD CODE TO SET THE VALUE
    }
    
    public String get(String key) {
    	//ADD CODE TO RETRIEVE THE VALUE
    	
    	return ""; //should be replaced with actual value
    }
	
	public static void main(String[] args) throws SQLException {
		
	
	  RedisService service = RedisService.getInstsance();
	  // service.set("somekey","somevalue")
	  // service.get("somekey");
	  System.out.println("Vaue:"+ service.get("somekey")); 
		
		//get();
	}

}
