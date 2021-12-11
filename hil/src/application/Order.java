package application;

import java.util.ArrayList;

public class Order {
ArrayList<CartProduct> CartProducts;
int TableNo;
Double Total;

public Order()
{
	CartProducts=new ArrayList<CartProduct>();
}

public ArrayList<CartProduct> getCartProducts() {
	return CartProducts;
}

public void setCartProducts(ArrayList<CartProduct> cartProducts) {
	CartProducts = cartProducts;
}

public int getTableNo() {
	return TableNo;
}

public void setTableNo(int tableNo) {
	TableNo = tableNo;
}

public Double getTotal() {
	return Total;
}

public void setTotal(Double total) {
	Total = total;
}


}
