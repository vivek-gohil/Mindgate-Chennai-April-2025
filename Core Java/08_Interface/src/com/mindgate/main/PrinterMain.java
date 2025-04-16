package com.mindgate.main;

import com.mindgate.main.domain.Canon50;
import com.mindgate.main.domain.HP3234;
import com.mindgate.main.domain.Printer;
import com.mindgate.main.domain.WifiPlugin;

public class PrinterMain {
	public static void main(String[] args) {
//		Printer printer = new HP3234();
//		printer.print();
//		
		Printer printer = new Canon50();
//		printer.print();
//		if (printer instanceof Canon50) {
//			WifiPlugin wifiPlugin = (WifiPlugin) printer;
//			wifiPlugin.doWifiPrinting();
//		}

		Canon50 canon50 = (Canon50) printer;
		canon50.doWifiPrinting();

	}
}
