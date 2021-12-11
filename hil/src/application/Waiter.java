package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Waiter  implements Initializable{
	MenuController MenuCard;
    ArrayList<Order> orders;
    @FXML
    private GridPane MenuGrid;
    @FXML
    private Button CheckOut;

    @FXML
    void CheckOutHandled(ActionEvent event) {
        if(event.getSource()==CheckOut)
        {
        	System.out.println("happening");
        	//creating an order object
            Order obj=new Order();
            //setting the table number where the order has to be delivered
            obj.setTableNo(MenuCard.getTableno());
            obj.setTotal(MenuCard.getTotal());
            obj.setCartProducts(MenuCard.getCart());
        	System.out.println(obj.getTableNo());
        	System.out.println(obj.getTotal());
            orders.add(obj);
            
        }
        MenuCard.ClearCart();
    }
    
   public Waiter() 
    {
	  
	   
    
    	orders=new ArrayList<Order>();
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

	public ArrayList<Order> getOrder() {
		return orders;
	}

	public void setOrder(ArrayList<Order> order) {
		this.orders = order;
	}

	public Order EditOrder()
	{
		return null;
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		   FXMLLoader fxmlLoader = new FXMLLoader();
		       fxmlLoader.setLocation(this.getClass().getResource("Menu.fxml"));
		       AnchorPane anchorPane = null;
		       System.out.println("we been selected");
			   try {
				anchorPane = (AnchorPane)fxmlLoader.load();
				MenuCard=(MenuController)fxmlLoader.getController() ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 

           this.MenuGrid.add(anchorPane, 0,1);
           MenuGrid.setMargin(anchorPane, new Insets(0.0D));
		// TODO Auto-generated method stub
		
	}

}
