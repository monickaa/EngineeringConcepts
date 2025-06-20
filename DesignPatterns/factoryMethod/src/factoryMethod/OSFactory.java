package factoryMethod;

public class OSFactory {
	
public OS getInstance(String item) {
	
	if(item.equals("Android")){
		return new Android();
	}
	else if(item.equals("Windows")) {
		return new Windows();
	}
	else {
		return new IOS();
	}
	
}
}
