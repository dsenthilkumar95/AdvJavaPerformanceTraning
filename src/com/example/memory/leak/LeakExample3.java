package com.example.memory.leak;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LeakExample3 {

	public static void main(String args[]) throws Exception {

		Map map = new HashMap();

		for (; true;) {
			//WonderKey key = new WonderKey("Super Key");
			map.put(new WonderKey("Super Key"), "Super Value");
			//System.out.println(key.hashCode());
			//key = null;
			//TimeUnit.MILLISECONDS.sleep(200);
		}
		
	}

}

class WonderKey {

	public final String key;

	public WonderKey(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		return this.key.hashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof WonderKey) {
			WonderKey otherKey = (WonderKey) other;
			return otherKey.key.equals(this.key);
		}
		return false;
	}

}
