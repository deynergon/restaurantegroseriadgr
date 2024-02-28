package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        String usuario;
        String contrasenaUsu;
        String contrasenaUsuBD="deyner2004";
        String correo;


        Integer opcion;
      gi 
        System.out.println("**Bienvenido al restaurante Groseria**");

        boolean loginExitoso=false;
        int intentosFallidos = 0;
        final int limiteIntentos = 3;

        while (!loginExitoso && intentosFallidos < limiteIntentos) {

            System.out.println("Apreciado cliente digite sus datos");
            System.out.print("Digite su usuario: ");
            usuario=keyboard.nextLine();
            System.out.print("Digite su correo: ");
            correo=keyboard.nextLine();
            System.out.print("Digite su contraseña: ");
            contrasenaUsu=keyboard.nextLine();

            //login

            if (contrasenaUsu.equals(contrasenaUsuBD)) {
                System.out.println("Cargando sistema");
                loginExitoso = true;
            } else {
                intentosFallidos++;
                System.out.println("Contraseña incorrecta. Intento " + intentosFallidos + " de " + limiteIntentos);
            }
        }


        System.out.println("\n....Restaurante groseria....");
        System.out.println("1. Ingresar orden");
        System.out.println("2. Modificar compra");
        System.out.println("3. Terminar orden y calcular el total");
        System.out.println("4. Salir");


        Integer cantidadentradadecangrejodeurrao=0;
        Integer cantidadescalopesalarigo=0;
        Integer cantidadfiletetourdefrancia=0;
        Integer cantidadcorvinaderigo=0;
        Integer cantidadcoctelmichelle=0;
        Integer cantidadjugosdeurrao=0;

        int productoSeleccionado=0;
        int cantidad=0;
        int continuar=0;



        do {
            System.out.println("Selecciones una opcion");
            opcion=keyboard.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("1. Entrada de cangrejo ($28000)");
                    System.out.println("2. escalopes a la rigo ($35000)");
                    System.out.println("3. Filetes de tour de Francia ($150000)");
                    System.out.println("4. Corvina de Rigo ($80000)");
                    System.out.println("5. Coctel Michelle ($20000)");
                    System.out.println("6. Jugos de Urrao ($18500)");
                    System.out.println("7. Para finalizar la orden");
                    System.out.println("************************");
                    do {
                        System.out.print("digite producto deseado: ");
                        productoSeleccionado=keyboard.nextInt();
                        switch (productoSeleccionado){
                            case 1:
                                System.out.print("digite cuantas entradas de cangrejo desea: ");
                                cantidadjugosdeurrao= keyboard.nextInt();
                                break;

                            case 2:
                                System.out.print("digite cuantas escalopes a la rigo desea: ");
                                cantidadescalopesalarigo= keyboard.nextInt();
                                break;

                            case 3:
                                System.out.print("digite cuantos filetes de tour de Francia desea: ");
                                cantidadfiletetourdefrancia= keyboard.nextInt();
                                break;

                            case 4:
                                System.out.print("digite cuantas Corvina de Rigo desea: ");
                                cantidadcorvinaderigo= keyboard.nextInt();
                                break;

                            case 5:
                                System.out.print("Digite cuantos Coctel Michelle desea: ");
                                cantidadcoctelmichelle=keyboard.nextInt();
                                break;

                            case 6:
                                System.out.print("Digites cuantos jugos de Urrao desea: ");
                                cantidadjugosdeurrao=keyboard.nextInt();
                                break;

                            case 7:
                                System.out.println("Orden terminada");
                                break;

                            default:
                                System.out.println("producto no encontrado");
                                break;
                        }

                    }while (productoSeleccionado!=7);

                    break;

                case 2:

                    do {
                        System.out.println("Por favor, ingrese la cantidad de cada producto:");
                        System.out.println("1. Entrada de cangrejo ($28000)");
                        System.out.print("Cantidad de Entrada de cangrejo: ");
                        cantidadentradadecangrejodeurrao += keyboard.nextInt();

                        System.out.println("2. Escalopes a la rigo ($35000)");
                        System.out.print("Cantidad de Escalopes a la rigo: ");
                        cantidadescalopesalarigo += keyboard.nextInt();

                        System.out.println("3. Filetes de tour de Francia ($150000)");
                        System.out.print("Cantidad de Filetes de tour de Francia: ");
                        cantidadfiletetourdefrancia += keyboard.nextInt();

                        System.out.println("4. Corvina de Rigo ($80000)");
                        System.out.print("Cantidad de Corvina de Rigo: ");
                        cantidadcorvinaderigo += keyboard.nextInt();

                        System.out.println("5. Coctel Michelle ($20000)");
                        System.out.print("Cantidad de Coctel Michelle: ");
                        cantidadcoctelmichelle += keyboard.nextInt();

                        System.out.println("6. Jugos de Urrao ($18500)");
                        System.out.print("Cantidad de Jugos de Urrao: ");
                        cantidadjugosdeurrao += keyboard.nextInt();


                        System.out.println("¿Desea agregar más productos? (1: Sí / 0: No)");
                        continuar = keyboard.nextInt();
                    } while (continuar == 1);

                    break;


                case 3:
                    Integer totalSinPropina = ((cantidadentradadecangrejodeurrao * 28000) + (cantidadescalopesalarigo * 35000) +
                            (cantidadfiletetourdefrancia * 150000) + (cantidadcorvinaderigo * 80000) + (cantidadcoctelmichelle * 20000) + (cantidadjugosdeurrao * 18500));

                    Double totalConPropina5 = totalSinPropina * 1.05;
                    Double totalConPropina10 = totalSinPropina * 1.10;

                    System.out.println("Total sin propina: $" + totalSinPropina);
                    System.out.println("Total con propina del 5%: $" + totalConPropina5);
                    System.out.println("Total con propina del 10%: $" + totalConPropina10);

                    System.out.println("¿Desea agregar propina? (1: 5% / 2: 10% / 0: No)");
                    int opcionPropina = keyboard.nextInt();
                    switch (opcionPropina) {
                        case 1:
                            System.out.println("Total a pagar (incluyendo 5% de propina): $" + totalConPropina5);
                            break;
                        case 2:
                            System.out.println("Total a pagar (incluyendo 10% de propina): $" + totalConPropina10);
                            break;
                        default:
                            System.out.println("Total a pagar (sin propina): $" + totalSinPropina);
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Compra terminada muchas gracias por preferirnos");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;

            }

        }while (opcion !=4);


    }
}