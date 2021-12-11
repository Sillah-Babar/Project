package application;

import java.util.ArrayList;
import java.util.List;

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

public void setCartProducts(List<CartProduct> list) {
	CartProducts = (ArrayList<CartProduct>) list;
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
