package implement.designpatterns.structural;

public class BuyStockC implements OrderC{
	
	   private StockC abcStock;

	   public BuyStockC(StockC abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.buy();
	   }
	
}
