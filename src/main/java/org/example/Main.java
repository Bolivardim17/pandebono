package org.example;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String cedula;
        LocalDate fecha = LocalDate.now();
        String nombreCliente;
        String nombreEmpleado;
        String contrasenaEmpleado;
        String nombreEmpleadoBD = "andres2587";
        String contrasenaEmpleadoBD = "admin123";

        Integer opcion;
        Scanner leerDato = new Scanner(System.in);

        System.out.println("***PandebonosNairo***");
        System.out.println("*******************");
        System.out.println("Apreciado empleado inicie seccion: ");
        boolean logimExitoso = false;

        while(logimExitoso==false) {

            System.out.printf("Digite su usuario: ");
            nombreEmpleado = leerDato.nextLine();
            System.out.printf("Digita su contraseña: ");
            contrasenaEmpleado = leerDato.nextLine();

            //


            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD)) {
                System.out.printf("Iniciando Seccion");
                logimExitoso=true;
            } else {
                System.out.printf("usuario o contraseña incorrecta ");
            }

        }


        System.out.println(".....pandesofware.....");
        System.out.println("1. registrar compra ");
        System.out.println("2. Calcular total");
        System.out.println("3. Modificar compra");
        System.out.println("4. Salir");



        do {
            System.out.println(" seleccione una opcion: ");
            opcion=leerDato.nextInt();

            Integer cantidadtradicional=0;
            Integer cantidadGuayaba=0;
            Integer cantidadArequipe=0;
            Integer cantidadQuesos=0;
            Integer cantidadBebidas=0;

            Integer productoSeleccionado;


            switch (opcion){
                case 1:
                    System.out.println("1. Pandebono tradicional $8000");
                    System.out.println("2. Pandebono guayaba $ 9500");
                    System.out.println("3. Pandebono arequipe $ 12000");
                    System.out.println("4. Pandebono 7 quesos $ 20000");
                    System.out.println("5. Bebida $ 9500");
                    System.out.println("6. terminar pedido");

                    do {
                        System.out.println("Digite el producto deseado: ");
                        productoSeleccionado=leerDato.nextInt();
                        switch (productoSeleccionado){

                            case 1:
                                System.out.println("digita cuantos tradicionales deseas: ");
                                cantidadtradicional=leerDato.nextInt();
                                break;
                            case 2:
                                System.out.println("digita cantidad guayaba deseas: ");
                                cantidadGuayaba=leerDato.nextInt();
                                break;
                            case 3:
                                System.out.println("digita cantidad arequipe deseada: ");
                                cantidadArequipe=leerDato.nextInt();
                                break;
                            case 4 :
                                System.out.println("Digita cantidad 7 quesos deseada: ");
                                cantidadQuesos=leerDato.nextInt();
                                break;
                            case 5:
                                System.out.println("digita que bebida desea: ");
                                cantidadBebidas=leerDato.nextInt();
                            case 6:
                                System.out.println("orden terminada");
                                break;
                            default:
                                System.out.println("producto no encontrado");
                                break;
                        }
                    }while (productoSeleccionado!=6);

                    break;
                case 2:
                    double totalSinPropina=((cantidadtradicional*8000)+
                            (cantidadGuayaba*9500)+
                            (cantidadArequipe*12000)+
                            (cantidadQuesos*20000)+
                            (cantidadBebidas*9500));

                    double totalConPropina=((totalSinPropina)+(totalSinPropina*0.1));
                    break;

                case 3:
                    
                    break;
                case 4:
                    break;
                default:
                    break;


            }

        }while(opcion !=4);











    }
}