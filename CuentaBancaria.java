import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        String nombre = "John Doe";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("-----------------------------");
        System.out.println("Nombre de cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo de la cuenta: " + saldo + "$");
        System.out.println("-----------------------------");

        System.out.println("\n");

        String menu = """
                Menu de opciones
                1. Consultar saldo
                2. Retirar
                3. Depositar
                9. Salir
                
                Seleccione el numero de la opcion a ejecutar:""";

        while(opcion != 9){
            System.out.println(menu);
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("El saldo de la cuenta es: " + saldo + "$\n");
                    break;
                case 2:
                    System.out.println("Introduzca la cantidad a retirar:");
                    double cantidadRetiro = teclado.nextDouble();
                    if (cantidadRetiro > saldo){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo = saldo - cantidadRetiro;
                        System.out.println("Saldo restante en la cuenta: " + saldo);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Introduzca la cantidad a depositar:");
                    double cantidadDeposito = teclado.nextDouble();
                    saldo += cantidadDeposito;
                    System.out.println("Usted deposito " + cantidadDeposito + " y su saldo ahora es de " + saldo);
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestro servicio!");
                    break;
                default:
                    String opcionIncorrecta = """
                            -Opcion invalida-
                            Por favor, seleccione una de las opciones
                            mostradas en el menu.
                            """;
                    System.out.println(opcionIncorrecta);
            }
        }
    }
}
