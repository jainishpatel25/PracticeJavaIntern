package GenericsExample.UpperBoundExample;


public class PriceCalculator<T extends Number> {

	private T price;
	private int quantity;
	
	public PriceCalculator(T price , int quantity) {
		this.price = price ;
		this.quantity = quantity;
	}
	
	public double getTotal() {
		return price.doubleValue() * quantity;
//		return price.doubleValue() * quantity.doubleValue();
	}
	
	public void displayBill() {
		System.out.println("Item Price : " +price);
		System.out.println("Quantity : " +quantity);
		System.out.println("Total Bill : " +getTotal());
		System.out.println();
	}

	public static void main(String[] args) {
		
		PriceCalculator<Double> pd = new PriceCalculator<>(23000.00,2);
		pd.displayBill();
		
		PriceCalculator<Integer> pi = new PriceCalculator<>(10,2);
		pi.displayBill();
	}
}
