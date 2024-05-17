// Clase CuentaCorriente
	package Paquete;

public class CuentaCorriente extends Cuenta {
	    private double sobregiro;

	    public CuentaCorriente(double saldoInicial, double tasaAnual) {
	        super(saldoInicial, tasaAnual);
	        this.sobregiro = 0;
	    }

	    @Override
	    public void retirar(double monto) {
	        if (monto <= this.saldo) {
	            super.retirar(monto);
	        } else {
	            this.sobregiro += monto - this.saldo;
	            this.saldo = 0;
	            this.numRetiros++;
	        }
	    }

	    @Override
	    public void consignar(double monto) {
	        if (this.sobregiro > 0) {
	            if (monto <= this.sobregiro) {
	                this.sobregiro -= monto;
	            } else {
	                this.saldo += monto - this.sobregiro;
	                this.sobregiro = 0;
	            }
	        } else {
	            super.consignar(monto);
	        }
	    }

	    @Override
	    public void extractoMensual() {
	        super.extractoMensual();
	    }

	    @Override
	    public void imprimir() {
	        super.imprimir();
	        System.out.println("Sobregiro: " + this.sobregiro);
	        System.out.println("Número de transacciones: " + (this.numConsignaciones + this.numRetiros));
	    }
	}
