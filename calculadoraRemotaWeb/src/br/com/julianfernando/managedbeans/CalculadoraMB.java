package br.com.julianfernando.managedbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.julianfernando.sessionbeans.CalculadoraIf;

@ManagedBean
public class CalculadoraMB {
	
	@EJB
	private CalculadoraIf calculadora;
	
	private double a;
	
	private double b;

	private double resultado;
	
	public CalculadoraIf getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(CalculadoraIf calculadora) {
		this.calculadora = calculadora;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void soma() {
		this.resultado = this.calculadora.soma(a, b);
	}
	
	public void subtrair() {
		this.resultado = this.calculadora.subtracao(a, b);
	}
	
	public void multiplica() {
		this.resultado = this.calculadora.multiplicacao(a, b);
	}
	
	public void divide() {
		this.resultado = this.calculadora.divisao(a, b);
	}
}
