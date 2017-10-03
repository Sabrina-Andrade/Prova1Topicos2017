package br.edu.univas.core;

import br.edu.univas.api.FibonacciCalcService;
import br.edu.univas.api.Result;

public class CalcServiceImpl implements FibonacciCalcService {

	@Override
	public Result fibcalc(int num) {
		int fib = CalculoLib.fib(num);
		Result result = new Result(num, fib);
		return result;
	}

}
