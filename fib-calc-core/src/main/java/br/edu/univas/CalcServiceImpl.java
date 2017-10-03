package br.edu.univas;

public class CalcServiceImpl implements FibonacciCalcService {

	@Override
	public Result fibcalc(int num) {
		int fib = CalculoLib.fib(num);
		Result result = new Result(num, fib);
		return result;
	}

}

