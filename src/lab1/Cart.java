package lab1;
import java.util.HashMap;
import java.util.Map;
public class Cart {
 private Map<Product,Integer> products;
 public Cart(){
	 products= new HashMap<>();
 };
 public void add(Product produs,int quantity){
	 products.put(produs, quantity);
 }
 
 public float getTotalPrice(){
	 float totalPrice =0;
	 for (Map.Entry<Product, Integer> entry : products.entrySet()) {
		 totalPrice=totalPrice+entry.getKey().getPrice(entry.getValue());
	 }
	 return totalPrice;
 }
 
 public String toString(){
	 String mesaj= new String("Produsele din cos: ");
	 for (Map.Entry<Product, Integer> entry : products.entrySet()) {
		 mesaj=mesaj + " "+ entry.getKey().toString()+",";
}
	 return mesaj;
}
}