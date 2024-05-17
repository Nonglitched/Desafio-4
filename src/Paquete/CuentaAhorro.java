// Clase CuentaAhorro
package Paquete;

public class CuentaAhorro extends Cuenta {
    private boolean cuentaActiva;

    public CuentaAhorro(double saldoInicial, double tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.cuentaActiva = this.saldo >= 10000;
    }

    @Override
    public void consignar(double monto) {
        if (this.cuentaActiva) {
            super.consignar(monto);
        } else {
            System.out.println("La cuenta de ahorros está inactiva.");
        }
    }

    @Override
    public void retirar(double monto) {
        if (this.cuentaActiva) {
            super.retirar(monto);
        } else {
            System.out.println("La cuenta de ahorros está inactiva.");
        }
    }

    @Override
    public void extractoMensual() {
        if (this.numRetiros > 4) {
            this.comisionMensual += (this.numRetiros - 4) * 1000;
        }
        super.extractoMensual();
        this.cuentaActiva = this.saldo >= 10000;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta activa: " + this.cuentaActiva);
        System.out.println("Número de transacciones: " + (this.numConsignaciones + this.numRetiros));
    }
}