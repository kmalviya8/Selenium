package com.edureka.Frameworks;

import java.io.IOException;

import org.testng.annotations.Test;

import utils.ReadExcel;

public class Applications {

	@Test
	public void applicationFunctionalityTest() throws IOException {
		String[][] data2 = ReadExcel.getData("TestData.xlsx", "Sheet2");
		String[][] data1 = ReadExcel.getData("TestData.xlsx", "Sheet1");

		for (int k = 1; k < data1.length; k++) {
		   for (int i = 1; i < data2.length; i++) {

			switch (data2[i][3]) {

			case "openBrowser": // i=1,9
				Methods.openBrowser();
				break;

			 case "maximizeBrowser": //i=2,10 
				 Methods.maximizeBrowser(); 
				 break;
				 
			 case "navigateTo"://i=3,11
			     Methods.navigateTo(data2[i][6]); 
			     break;
			 case "enterInvalidUsername"://i=4,12 
				  Methods.enterInvalidUsername(data2[i][5],data1[k][1]);  // Hybrid Framework
				 //Methods.enterInvalidUsername(data2[i][5],data2[i][6]); //Key Driven Framework
				 break;
			  
			 case "enterInvalidPassword"://i=5,13 
				 Methods.enterInvalidPassword(data2[i][5], data1[k][2]);  // Hybrid Framework
				 //Methods.enterInvalidPassword(data2[i][5], data2[i][6]);  //Key Driven Framework
				 break;
			  
			 case "clickSubmit"://i=6,14 
				 Methods.clickSubmit(data2[i][4], data2[i][5]);
			     break;
			 case "verifyMessage": //i=7,15 
				 Methods.verifyMessage(data2[i][1], data2[i][5],data2[i][6]); break;
			  case "closeBrowser": //i=8,16 
				  Methods.closeBrowser(); 
				  break;
			 

			}
		}
		}

	}

}
