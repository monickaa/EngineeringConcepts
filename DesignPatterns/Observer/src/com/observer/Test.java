package com.observer;

public class Test {
public static void main(String[]a) {
	StockMarket market = new StockMarket();

    Observer mobile = new MobileApp();
    Observer web = new WebApp();

    market.register(mobile);
    market.register(web);
    market.deregister(mobile);
    market.notifyy();
}
}
