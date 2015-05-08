package br.com.julianfernando.sessionbeans;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(CalculadoraIf.class)
public class CalculadoraBean implements CalculadoraIf {

	@Override
	public double soma(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double subtracao(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiplicacao(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double divisao(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

}
