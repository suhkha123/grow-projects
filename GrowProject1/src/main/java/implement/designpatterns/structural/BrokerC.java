package implement.designpatterns.structural;

import java.util.ArrayList;
import java.util.List;

public class BrokerC {

	 private List<OrderC> orderList = new ArrayList<OrderC>(); 

	   public void takeOrder(OrderC order){
	      orderList.add(order);		
	   }

	   public void placeOrders(){
	   
	      for (OrderC order : orderList) {
	         order.execute();
	      }
	      orderList.clear();
	   }
	   
}
