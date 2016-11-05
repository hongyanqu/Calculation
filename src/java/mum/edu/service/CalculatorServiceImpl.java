package mum.edu.service;

import mum.cs545.calculator.domain.Calculator;

public class CalculatorServiceImpl implements CalculatorService  {

	
	
	public void add(Calculator calculator){
		calculator.add();
		
		/*
		  if calculator.getSum() <= 0
		  	register debit
		  	notify debit processor
		 */
		return ;
	}
	
	public void mult(Calculator calculator){
		calculator.mult();
		
		/*
		  if calculator.getMult() >  maxLimit
		  	register over budget
		  	notify overflow processor
		 */

		
		return ;
	}
 
}
