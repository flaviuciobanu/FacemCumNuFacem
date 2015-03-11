package lab1;

public class Laptop extends Product{

private String screenSize;
private String proccesor;
 public Laptop(String name, float price,String screenSize, String proccesor){
	 this.name=name;
	 this.price=price;
	 this.screenSize=screenSize;
	 this.proccesor=proccesor;
 }
 @Override
 public float getPrice(int quantity){
	float reducere=(float)1;
	if(quantity>3)reducere=(float)0.9;
	if(quantity>6)reducere=(float)0.8;
	if(quantity>10)reducere=(float)0.5;
	 return (this.price*quantity)*reducere;
 }
@Override 
 public String toString(){
	 return super.name+" "+ super.price+" "+this.screenSize+" "+this.proccesor;
 }
 }

