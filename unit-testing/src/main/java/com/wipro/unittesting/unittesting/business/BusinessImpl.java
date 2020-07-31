package com.wipro.unittesting.unittesting.business;

import com.wipro.unittesting.unittesting.data.SomeDataService;

public class BusinessImpl {
    private SomeDataService dataService;
    
	public void setDataService(SomeDataService dataService) {
		this.dataService = dataService;
	}
	public int calculateSumUsingDataService() {
		
		int sum=0;
		int data[] = dataService.retrieveAllData();
		for(int tempData:data) {
			sum=sum + tempData;
		}
		return sum;
	}
	public int calculateSum(int[] data) {
		
		int sum=0;
		
		for(int tempData:data) {
			sum=sum + tempData;
		}
		return sum;
	}
}
