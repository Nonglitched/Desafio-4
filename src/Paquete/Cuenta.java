// Clase abstracta Cuenta
package Paquete;

public abstract class Cuenta {
    protected double saldo;
    protected int numConsignaciones;
    protected int numRetiros;
    protected double tasaAnual;
    protected double comisionMensual;

    public Cuenta(double saldoInicial, double tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(double monto) {
        this.saldo += monto;
        this.numConsignaciones++;
    }

    public void retirar(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            this.numRetiros++;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void calcularInteresMensual() {
        double interesMensual = this.saldo * (this.tasaAnual / 12);
        this.saldo += interesMensual;
    }

    public void extractoMensual() {
        this.saldo -= this.comisionMensual;
        this.calcularInteresMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Número de consignaciones: " + this.numConsignaciones);
        System.out.println("Número de retiros: " + this.numRetiros);
        System.out.println("Tasa anual: " + this.tasaAnual);
        System.out.println("Comisión mensual: " + this.comisionMensual);
    }
}



