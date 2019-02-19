package cart;

import static org.junit.Assert.*;

import org.junit.Test;

public class cartest {

	@Test
	public void test() {
	cart obj=new cart();
	assertTrue(obj.getCount()==0);
	}
	@Test
	public void test2() {
		cart obj=new cart();
		Product obj1=new Product("java",127,1);
		obj.addProduct(obj1);
		assertTrue(obj.getCount()==1);
		assertTrue(obj.gettotalprice()==127);
		}
	
	@Test
	public void test3() {
		cart obj=new cart();
		Product obj1=new Product("java",127,1);
		Product obj2=new Product("Web",100,1);
		obj.addProduct(obj1);
		obj.addProduct(obj2);
		assertTrue(obj.getCount()==2);
		assertTrue(obj.gettotalprice()==227);
		}

}
