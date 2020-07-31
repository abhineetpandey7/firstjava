package com.wipro.unittesting.unittesting;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.wipro.unittesting.unittesting.business.BusinessImpl;
import com.wipro.unittesting.unittesting.data.SomeDataService;


@ExtendWith(MockitoExtension.class) 
class SomeBusinessMockTest {
	@InjectMocks
	BusinessImpl business;
	@Mock
	SomeDataService data;
	
	@Test
	void someCalculateTestUsingDataService() {
		
		
		when(data.retrieveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6,business.calculateSumUsingDataService());
	}
	@Test
	void someCalculateTestOneValue() {
		
		when(data.retrieveAllData()).thenReturn(new int[] {5});
		assertEquals(5,business.calculateSumUsingDataService());
	}
	@Test
	void someEmptyCalculateTest() {
		
		when(data.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(0,business.calculateSumUsingDataService());
	}

}
