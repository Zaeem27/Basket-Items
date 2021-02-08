package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import collections.Basket;
import items.Apple;
import items.Banana;
import items.Fruit;
import items.Orange;
import junit.framework.Assert;

public class BasketTest {
	static Basket basket = null;
	static List<Fruit> fruitList = null;
	static Fruit f1 = null;
	static Fruit f2 = null;
	static Fruit f3 = null;

	@Before
	public void setUpBeforeClass() throws Exception {
		f1 = new Apple("a1", 2.0f);
		f2 = new Banana("b1", 1.5f);
		f3 = new Orange("o1", 2.5f);
		
		fruitList = new ArrayList<Fruit>();
		fruitList.add(f1);
		fruitList.add(f2);
		fruitList.add(f3);
		
		basket = new Basket(fruitList);
		
	}

	@Test
	public void testAdd() {
		Fruit f4 = new Apple("a2", 2.0f);
		basket.addFruit(f4);
		assertEquals(4, basket.totalItems());
	}
	
	@Test
	public void testRemove1() {
		assertEquals(basket.removeFruit(f1), f1);
	}
	
	@Test
	public void testRemove2() {
		basket.removeFruit(f1);
		basket.removeFruit(f2);
		assertEquals(basket.totalItems(), 1);
	}

	@Test
	public void testPriceCalc() {
		assertEquals(basket.calcPrice(), 6.0f, 0.0001);
	}
}
