package lab1;

public class Mobile extends Product{

	
	private String os;
	 Mobile(String name, float price, String os){
		 this.name=name;
		 this.price=price;
		 
		 this.os=os;
	 }
	 @Override
	 public float getPrice(int quantity){
		float reducere=(float)1;
		if(quantity>10)reducere=(float)0.8;
		if(quantity>30)reducere=(float)0.5;
		if(quantity>100)reducere=(float)0.3;
		 return (this.price*quantity)*reducere;
	 }
	@Override 
	 public String toString(){
		 return super.name+" "+ super.price+" "+this.os;
	 }
}
