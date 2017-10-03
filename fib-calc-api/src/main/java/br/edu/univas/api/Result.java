package br.edu.univas.api;

public class Result {

	private int num;
	private int fib;

	public Result(int num, int fib) {
		this.num = num;
		this.fib = fib;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getFib() {
		return fib;
	}

	public void setFib(int fib) {
		this.fib = fib;
	}
}
