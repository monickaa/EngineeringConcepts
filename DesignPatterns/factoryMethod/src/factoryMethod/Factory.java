package factoryMethod;

public class Factory {
public static void main(String[] a) {
	OSFactory obj=new OSFactory();
	OS product=obj.getInstance("IOS");
	product.open();
}
}
