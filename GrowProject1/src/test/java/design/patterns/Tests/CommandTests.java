package design.patterns.Tests;

import org.testng.annotations.Test;

import implement.designpatterns.behavioral.AdditionS;
import implement.designpatterns.behavioral.MultiplicationS;
import implement.designpatterns.behavioral.Strategy;
import implement.designpatterns.behavioral.SubstractionS;
import implement.designpatterns.structural.*;;

public class CommandTests {
	
    StockC abcStock = new StockC();
    BrokerC broker = new BrokerC();

	@Test
	public void buyStockTest() {
	      BuyStockC buyStockOrder = new BuyStockC(abcStock);
	      broker.takeOrder(buyStockOrder);
	      broker.placeOrders();

	}

	@Test
	public void sellStockTest() {
	      SellStockC sellStockOrder = new SellStockC(abcStock);
	      broker.takeOrder(sellStockOrder);
	      broker.placeOrders();
	}


}
