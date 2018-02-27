package com.springboot.test;
import org.junit.Assert;
import org.junit.Test;
public class HelloMaven {
	@Test
	public void test() {
		Assert.assertEquals("Hello Maven", new String("Hello Maven"));
	//System.out.println("Hello Maven");
	}
}
