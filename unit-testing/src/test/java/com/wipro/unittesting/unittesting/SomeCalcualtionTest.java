package com.wipro.unittesting.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.unittesting.unittesting.business.BusinessImpl;
import com.wipro.unittesting.unittesting.data.SomeDataService;
class SomeDataServiceStub implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}
	
} 
class SomeCalcualtionTest {
	@Test
	void someCalculateTestUsingDataService() {
		
		BusinessImpl business= new BusinessImpl();
		business.setDataService(new SomeDataServiceStub());
		int actualResult = business.calculateSumUsingDataService();
		
		int expectedResult = 6;
		assertEquals(expectedResult,actualResult);
	}
	@Test
	void someCalculateTest() {
		
		BusinessImpl business= new BusinessImpl();
		int actualResult = business.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult,actualResult);
	}
	@Test
	void someEmptyCalculateTest() {
		
		BusinessImpl business= new BusinessImpl();
		int actualResult = business.calculateSum(new int[] {});
		int expectedResult = 1;
		assertEquals(expectedResult,actualResult);
	}

}
