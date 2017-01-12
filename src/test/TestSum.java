package test;

import static org.junit.Assert.*;

import org.junit.Test;

import prueba.Sum;

public class TestSum {
	
	@Test
	public void test() {
		assertEquals(6,  sum(2, 4));
	}
	
	@Test
	public void test1WithZeros() {
		assertEquals(4,  sum(0, 4));
		assertEquals(4,  sum(4, 0));
	}
	
	@Test
	public void test1WithNegs() {
		assertEquals(10,  sum(12, -2));
		assertEquals(-7,  sum(-4, -3));
	}
	
	int sum(int a, int b){
		return Sum.sum(a, b);
	}

}
