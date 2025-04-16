package com.mindgate.main.domain;

public class Canon50 implements Printer , WifiPlugin {
	@Override
	public void print() {
		System.out.println("Canon50 is printing");
	}
	
	@Override
	public void doWifiPrinting() {
		System.out.println("Canon50 is printing over wifi");
	}
}
