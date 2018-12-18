package Test;

import junit.framework.TestCase;

import Program.SalaryCalcMain;

public class GorshkovaTest2 extends TestCase {

	public void testSalaryCalcMain(){
		SalaryCalcMain calc = new SalaryCalcMain();
		TestCase.assertEquals(3753.75, calc.calcNalog(26250.0,2625.0,13.0));
	}
	
}
