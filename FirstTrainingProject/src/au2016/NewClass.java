package au2016;

import java.util.Scanner;

public class NewClass implements trainingCalc {

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public Integer subtract(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public Long multiply(Integer a, Integer b) {
		// TODO Auto-generated method stub
		System.out.println(a+" "+b);
		return new Long(a*b);
	}

	@Override
	public Integer divide(Integer a, Integer b) throws ArithmeticException {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public Integer mod(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a%b;
	}

}
