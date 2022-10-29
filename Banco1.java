package Java.Nano;

import java.io.Serializable;

public class Banco1 implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int numero;
	private int agencia;
	private double saldo;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	
	public Banco1() 
	{
		
	}
	
	public Banco1(int numero, int agencia, double saldo)
	{
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		
	}
	
	public void Depositar(double valor)
	{
		this.saldo += valor;
	}
	
	public void Retirar(double valor)
	{
		this.saldo -= valor;
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	

	public static void main(String[] args) 
	{
		
	}

}
