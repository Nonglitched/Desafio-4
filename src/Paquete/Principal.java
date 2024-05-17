package Paquete;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Creando una cuenta de ahorro...");
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicialAhorro = scanner.nextDouble();
        System.out.print("Ingrese la tasa anual: ");
        double tasaAnualAhorro = scanner.nextDouble();
        CuentaAhorro cuentaAhorro = new CuentaAhorro(saldoInicialAhorro, tasaAnualAhorro);
        
        System.out.println("Creando una cuenta corriente...");
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicialCorriente = scanner.nextDouble();
        System.out.print("Ingrese la tasa anual: ");
        double tasaAnualCorriente = scanner.nextDouble();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(saldoInicialCorriente, tasaAnualCorriente);

        while (true) {
            System.out.println("\nSeleccione la operación que desea realizar:");
            System.out.println("1. Consignar en cuenta de ahorro");
            System.out.println("2. Retirar de cuenta de ahorro");
            System.out.println("3. Generar extracto mensual de cuenta de ahorro");
            System.out.println("4. Imprimir cuenta de ahorro");
            System.out.println("5. Consignar en cuenta corriente");
            System.out.println("6. Retirar de cuenta corriente");
            System.out.println("7. Generar extracto mensual de cuenta corriente");
            System.out.println("8. Imprimir cuenta corriente");
            System.out.println("9. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 9) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a consignar en cuenta de ahorro: ");
                    double montoConsignarAhorro = scanner.nextDouble();
                    cuentaAhorro.consignar(montoConsignarAhorro);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar de cuenta de ahorro: ");
                    double montoRetirarAhorro = scanner.nextDouble();
                    cuentaAhorro.retirar(montoRetirarAhorro);
                    break;
                case 3:
                    cuentaAhorro.extractoMensual();
                    System.out.println("Extracto mensual generado para cuenta de ahorro.");
                    break;
                case 4:
                    cuentaAhorro.imprimir();
                    break;
                case 5:
                    System.out.print("Ingrese el monto a consignar en cuenta corriente: ");
                    double montoConsignarCorriente = scanner.nextDouble();
                    cuentaCorriente.consignar(montoConsignarCorriente);
                    break;
                case 6:
                    System.out.print("Ingrese el monto a retirar de cuenta corriente: ");
                    double montoRetirarCorriente = scanner.nextDouble();
                    cuentaCorriente.retirar(montoRetirarCorriente);
                    break;
                case 7:
                    cuentaCorriente.extractoMensual();
                    System.out.println("Extracto mensual generado para cuenta corriente.");
                    break;
                case 8:
                    cuentaCorriente.imprimir();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}

