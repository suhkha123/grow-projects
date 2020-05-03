package implement.designpatterns.structural;

public class SellStockC implements OrderC{
	
	   private StockC abcStock;

	   public SellStockC(StockC abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.sell();
	   }
	
}
