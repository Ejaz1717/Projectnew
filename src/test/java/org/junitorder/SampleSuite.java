package org.junitorder;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SampleSuite {
	@Test
	public void tc1() {
		System.out.println("test 1");
		
	}
	@Test
	public void tc2() {
		System.out.println("test 2");
		
	}
	@Ignore
	@Test
	public void tc3() {
		System.out.println("test 3");
		
	}
	@Test
	public void tc4() {
		Assert.assertTrue(false);
		System.out.println("test 4");
	
		
	}
	public void tc5() {
		System.out.println("test 5");
	}
	@Test
	public void tc6() {
		System.out.println("test 6");
	}
	

}
