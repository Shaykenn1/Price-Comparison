package variables_example;

public class PriceComparison {
	public static void main (String[] args) {
		String item;
		Integer price;
		String competitor1name;
		Integer competitor1price;
		String competitor2name;
		Integer competitor2price;
		Integer savings1;
		Integer savings2;
		
		item = "laptop";
		price = 250;
		competitor1name = "Target: ";
		competitor1price = 350;
		competitor2name = "Walmart: ";
		competitor2price = 320;
		savings1 = competitor1price-price;
		savings2 = competitor2price-price;
		
		System.out.println("comparing prices for "+ item);
		System.out.println("our store: " + price);
		System.out.println(competitor1name + competitor1price);
		System.out.println("save: "+ savings1);
		System.out.println(competitor2name + competitor2price);
		System.out.println("save: "+ savings2);
		
		
		
		
	}

}
