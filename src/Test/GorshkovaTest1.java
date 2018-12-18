package Test;

import junit.framework.TestCase;

import Program.SalaryCalcMain;

public class GorshkovaTest1 extends TestCase {

	public void testSalaryCalcMain(){
		SalaryCalcMain calc = new SalaryCalcMain();
		TestCase.assertEquals(21101.85, calc.calcSalary(22050.0, 2205.0, 3153.15));
	}
	
}
