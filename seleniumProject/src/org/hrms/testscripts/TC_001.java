package org.hrms.testscripts;

import org.hrms.lib.General;

public class TC_001 {

	public static void main(String[] args) throws Exception {
		
		General obj = new General();
		obj.openApp();
		obj.searchProduct();
		obj.closeApp();
	}

}
