package lab1;

public class L1 {
 public static void main(String[] args){
	 Product p1 = new Laptop("HP TouchSmart", (float)20.00, "15", "Intel i7"); 
	 Product p2 = new Mobile("HTC mini 2", (float)100.00, "HTC");
	 Product p3 = new Laptop("Dell XPS", (float)50.00, "17", "Intel i7"); 
		
		Cart c = new Cart();
		c.add(p1, 5);
		c.add(p2, 1);
		c.add(p3, 1);
	
		System.out.println(c.toString());
		System.out.print("Pretul total:");
		System.out.println(c.getTotalPrice());
	
 }
}
