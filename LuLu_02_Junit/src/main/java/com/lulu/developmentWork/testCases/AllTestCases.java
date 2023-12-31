package com.lulu.developmentWork.testCases;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



//import org.junit.jupiter.api.Test;



//import com.lulu.developmentWork.BusinessLogicProcess;



public class AllTestCases {

	//test case 1
	//expect Vs Actually happening
	@Test
	void testCase1() {



	//BuinessLogic -- create its Objects --> invoke method to be tested
	BusinessLogicProcess blp= new BusinessLogicProcess();
	assertEquals(7, blp.show());
}

	@Test
	void testCase2() {



		//BuinessLogic -- create its Objects --> invoke method to be tested
		BusinessLogicProcess blp2= new BusinessLogicProcess();
		assertEquals(5, blp2.sub());
	}

	@Test
	void testCase3() {



		//BuinessLogic -- create its Objects --> invoke method to be tested
		BusinessLogicProcess blp3= new BusinessLogicProcess();
		assertEquals("s", blp3.Process());
	}


		@AfterAll
		static void someTaskEnd() {
			System.out.println("All done so well!");
		}


		@BeforeAll
		static void someTaskBefore() {
			System.out.println("All done so well!");
		}

}

