package inventario;

import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Validacion val = new Validacion();
        int opcionUsuario;
        Categoria categoria1 = null;
        Proveedor proveedor1 = null;
        Producto producto1 = null;
        String codCategoria, nomCategoria, descCategoria, codProv, nomProv, contactoProv, codProd, nomProd;
        int precioProd, stockProd;

        do {
            // Menu
            System.out.println("==== MENU ====");
            System.out.println("1.- Crear Categoria");
            System.out.println("2.- Crear Proveedor");
            System.out.println("3.- Crear producto");
            System.out.println("4.- Mostrar Producto");
            System.out.println("5.- Salir");
            // Input seleccion usuario
            opcionUsuario = Integer.parseInt(scanner.nextLine());
            // Ejecuciones

            switch (opcionUsuario) {
                case 1 -> {
                    // Codigo categoria
                    System.out.print("Ingrese codigo categoria : ");
                    codCategoria = scanner.nextLine();
                    // Nombre categoria (Validado)
                    System.out.print("Ingrese nombre categoria : ");
                    nomCategoria = scanner.nextLine();
                    while (val.validarNombre(nomCategoria) == false) {
                        System.out.println("Error, no puede ser un nombre vacio");
                        nomCategoria = scanner.nextLine();
                        if (val.validarNombre(nomCategoria)) {
                            break;
                        }
                    }

                    // Descripcion
                    System.out.print("Descripcion categoria : ");
                    descCategoria = scanner.nextLine();

                    // Creamos el objeto
                    categoria1 = new Categoria(codCategoria, nomCategoria, descCategoria);
                }

                case 2 -> {
                    // Codigo proveedor
                    System.out.print("Ingrese codigo Proveedor : ");
                    codProv = scanner.nextLine();
                    // Nombre proveedor (Validado)
                    System.out.print("Ingrese nombre Proveedor : ");
                    nomProv = scanner.nextLine();
                    while (val.validarNombre(nomProv) == false) {
                        System.out.println("Error, no puede ser  un nombre vacio");
                        nomProv = scanner.nextLine();
                        if (val.validarNombre(nomProv)) {
                            break;
                        }
                    }
                    // Contacto proveedor
                    System.out.print("Ingrese contacto Proveedor : ");
                    contactoProv = scanner.nextLine();

                    proveedor1 = new Proveedor(codProv, nomProv, contactoProv);
                }

                case 3 -> {
                    System.out.print("Ingrese codigo Producto :");
                    codProd = scanner.nextLine();
                    System.out.print("Ingrese nombre Producto : ");
                    nomProd = scanner.nextLine();
                    // Validando nombre
                    while (val.validarNombre(nomProd) == false) {
                        System.out.println("Error, ingrese nombre nuevamente : ");
                        nomProd = scanner.nextLine();
                        if (val.validarNombre(nomProd)) {
                            break;
                        }
                    }
                    // Validando precio
                    System.out.println("Ingrese precio producto : ");
                    precioProd = Integer.parseInt(scanner.nextLine());
                    while (val.validarPrecio(precioProd) == false) {
                        System.out.println("Error, ingrese un precio correcto (mayor a 0)");
                        precioProd = Integer.parseInt(scanner.nextLine());
                        if (val.validarPrecio(precioProd)) {
                            break;
                        }
                    }
                    // Validando stock
                    System.out.println("Ingrese stock inicial : ");
                    stockProd = Integer.parseInt(scanner.nextLine());
                    while (val.validarCantidad(stockProd) == false) {
                        System.out.println("Error , ingrese un stock mayor a 0");
                        stockProd = Integer.parseInt(scanner.nextLine());
                        if (val.validarCantidad(stockProd)) {
                            break;
                        }
                    }

                    // Creamos Producto
                    producto1 = new Producto(codProd, nomProd, precioProd, stockProd, categoria1, proveedor1);

                }

                case 4 -> {
                    if (producto1 == null || producto1.getProveedor() == null || producto1.getCategoria() == null) {
                        System.out.println("Debe de ingresar primero la categoria y proveedor");
                    } else {
                        System.out.println("=== INFORMACION PRODUCTO CREADO ===");
                        producto1.imprimirProducto();
                    }

                }

                default -> {
                    System.out.println("Opcion no valida");
                }

            }

        } while (opcionUsuario != 5);
        System.out.println("Gracias por usar el sistema!");

    }

}
