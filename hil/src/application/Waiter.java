package application;
public class Waiter {
	MenuController MenuCard;
    Order order;
    
   public Waiter()
    {
    	MenuCard=new MenuController();
    	order=new Order();
    }

	public void TakeOrder()
	{
		//if(MenuCard.getCheckedOut())
	}
	public MenuController getMenuCard() {
		return MenuCard;
	}

	public void setMenuCard(MenuController menuCard) {
		MenuCard = menuCard;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Order EditOrder()
	{
		return null;
		
	}

}
