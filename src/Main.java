import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();

    }
        static String nameClient = "Jorge";
        static String tipoCuenta = "Corriente";
        static Double saldo = 25000.00;

        public static void datosCliente() {
            System.out.println("\nNombre del Cliente: " + nameClient);
            System.out.println("Tipo de Cuenta: " + tipoCuenta);
            System.out.println("Saldo actual: $" + saldo);

        }

        public static void menu () {

            int opcion = 0;
            do {

                Scanner sc = new Scanner(System.in);

                System.out.println("\n***** Bienvenido al Sistema Bancario ******");
                System.out.println("\n Elige una opción:");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Retirar");
                System.out.println("9. Salir");
                opcion = sc.nextInt();

                switch (opcion) {

                    case 1: consultaSaldo(); break;
                    case 2: depositar(); break;
                    case 3: retirar(); break;
                    case 9: salir(); break;
                    default: System.out.println("Opción incorrecta. Intente nuevamente.");
                }

            } while (opcion != 9);
        }

        public static void consultaSaldo () {

            System.out.println("El saldo es: " + saldo);
        }

        public static void depositar () {

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el monto a depositar:");
            Double montoDepositar = sc.nextDouble();
            saldo += montoDepositar;
            System.out.println("Deposito realizado con éxito. Saldo actual: $" + saldo);
        }

        public static void retirar () {

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el monto a retirar:");
            Double montoRetirar = sc.nextDouble();

            if (montoRetirar <= saldo) {
                saldo -= montoRetirar;
                System.out.println("Retiro realizado con éxito. Saldo actual: $" + saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }

        public static void salir(){
            datosCliente();
            System.out.println("\nFue un placer atenderlo");

        }
}