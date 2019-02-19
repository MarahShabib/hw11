package cart;

import java.util.ArrayList;

public class cart {
	public  ArrayList <Product> pro=new ArrayList<Product>();
	
	public int getCount() {
		int count=0;
	   for(int i=0;i<pro.size();i++)
		   count+=pro.get(i).num;
	return count;
	}

	public void addProduct(Product obj1) {
		pro.add(obj1);
		
	}

	public int gettotalprice() {
		int count=0;
		   for(int i=0;i<pro.size();i++)
			   count+=(pro.get(i).num * pro.get(i).price);
		   
		return count;
	}
	
	
	

}
