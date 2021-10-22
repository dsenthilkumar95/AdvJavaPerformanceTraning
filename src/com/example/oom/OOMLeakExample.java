package com.example.oom;

import java.util.*;

public class OOMLeakExample {

    public static void main(String args[]) throws Exception {
	
	Map map = new HashMap();

	for(;true;) {
		map.put(new WonderKey("Super Key"),"Super Value"); 	 		
	}		

    }

}


class WonderKey {
	
	public final String key;

	public WonderKey(String key) {
		this.key = key;
	}

}

