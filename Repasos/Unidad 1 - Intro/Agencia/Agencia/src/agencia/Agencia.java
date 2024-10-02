package agencia;

import java.util.ArrayList;

public class Agencia {

    public static void main(String[] args) {
        // Creando un ejecutivo
        Ejecutivo barneygomez = new Ejecutivo("1","Barney",true);
        // Creando un usuario
        Cliente barsinson = new Cliente("1", "Bar", "Sinson", "Bouviere", "Avenida Siempreviva 742", "764-84377", "barsinson@gmail.com");

        // Creando un proveedor
        Proveedor proveedorTest = new Proveedor("1", "Proveedor de todo", "Chile", "Quilpue", true);

        // Creando una lista de cada tipo para agregarlo (mas adelante se usa para el paquete turistico)
        ArrayList<Actividad> actividadesBarSinSon = new ArrayList<>();
        ArrayList<TransporteTerrestre> transportesTerrestreBarSinSon = new ArrayList<>();
        ArrayList<Hotel> hotelesBarSinSon = new ArrayList<>();
        ArrayList<Vuelo> vuelosBarSinSon = new ArrayList<>();

        // Creando una actividad y agregandola a la lista de actividades
        Actividad playa = new Actividad("1", "Salida a playa", "Salida a playa x por 2 horas", new FechaCustom(2024, 12, 12), "13:13", 60000, "Shelbyville", 20);
        actividadesBarSinSon.add(playa);

        // Creando un transporte terrestre y agregandola a la lista de t. terrestres
        TransporteTerrestre busShelby = new TransporteTerrestre("1", "Bus", proveedorTest, 20, 10000, true);
        transportesTerrestreBarSinSon.add(busShelby);

        // Creando un hotel y agregandola a la lista de hoteles
        Hotel hotelShelby = new Hotel("1", "Hotel 5 estrellas Shelbyville", "Shelbyville", proveedorTest, 25000, 100, true);
        hotelShelby.disminuirDisponibilidad();
        hotelShelby.elegirHabitacion(0);
        hotelesBarSinSon.add(hotelShelby);

        // Creando un vuelo y agregandola a la lista de vuelos
        Vuelo vueloShelby = new Vuelo("1", "SH-1", new FechaCustom(2024, 12, 11), "10:30", "Springfield", "Shelbyville", proveedorTest, 25000, 20);
        vuelosBarSinSon.add(vueloShelby);

        // Creando un paquete de productos
        PaqueteTuristico paqueteTest = new PaqueteTuristico("1", "Paquete Para Bar SinSon", "Paquete de prueba", vuelosBarSinSon, hotelesBarSinSon, transportesTerrestreBarSinSon, actividadesBarSinSon);
        paqueteTest.calcularTotal();

        System.out.println("===== Seccion Reserva =====");
        // Creando la reserva
        Reserva reservaTest = new Reserva("1", "Reserva del bar sin son", barsinson, barneygomez, paqueteTest);
        barneygomez.aumentarVenta(); // + 1 reserva realizada al ejecutivo
        System.out.println(reservaTest);
        // Paguemos la reserva
        reservaTest.abonarReserva(120000);
        System.out.println(reservaTest.getEstadoReserva()); // probando estado de la reserva al ser pagada
        reservaTest.anularReserva(); // Probando anulando reserva
        System.out.println(reservaTest.getEstadoReserva()); // Imprime "anulado!"

        System.out.println("===== Seccion Reporte ===== ");

        // Creando Reporte
        ReporteV2 reporteTest = new ReporteV2("1", reservaTest);
        reporteTest.reporteFull(); // Inicializamos el analisis
        System.out.println(reporteTest.getTotalReservas() + " reserva(s)"); // Cuantas reservas se hicieron
        System.out.println(reporteTest.getMontoTotal() + "$ es el monto total en reservas"); // Valor total de todas las reservas en el reporte
        System.out.println(reporteTest.getMontoTotalPagado() + "$ es lo que se ha pagado.");
        System.out.println(reporteTest.getMontoTotalAdeudado() + "$ es lo que se debe.");
        System.out.println("Se encontraron en total : " + reporteTest.getCantidadActividades() + " actividade(s) reservada(s).");
        System.out.println("Se encontraron en total : " + reporteTest.getCantidadHoteles() + " hotele(s) reservado(s).");
        System.out.println("Se encontraron en total : " + reporteTest.getCantidadVuelos() + " vuelo(s) reservado(s).");

        // Creando otra reserva \\
        
        // Creando otra lista de cada tipo para agregarlo (mas adelante se usa para el paquete turistico)
        ArrayList<Actividad> actividadesBarSinSon2 = new ArrayList<>();
        ArrayList<TransporteTerrestre> transportesTerrestreBarSinSon2 = new ArrayList<>();
        ArrayList<Hotel> hotelesBarSinSon2 = new ArrayList<>();
        ArrayList<Vuelo> vuelosBarSinSon2 = new ArrayList<>();

        // Creando una actividad y agregandola a la lista de actividades
        Actividad playa2 = new Actividad("2", "Salida a playa", "Salida a playa x por 2 horas", new FechaCustom(2024, 12, 12), "13:13", 60000, "Shelbyville", 20);
        actividadesBarSinSon2.add(playa2);
        System.out.println(playa2);

        // Creando un transporte terrestre y agregandola a la lista de t. terrestres
        TransporteTerrestre busShelby2 = new TransporteTerrestre("2", "Bus", proveedorTest, 20, 10000, true);
        transportesTerrestreBarSinSon2.add(busShelby2);
        System.out.println(busShelby2);

        // Creando un hotel y agregandola a la lista de hoteles
        Hotel hotelShelby2 = new Hotel("2", "Hotel 5 estrellas Shelbyville", "Shelbyville", proveedorTest, 25000, 100, true);
        hotelShelby2.disminuirDisponibilidad();
        hotelShelby2.elegirHabitacion(0);
        hotelesBarSinSon2.add(hotelShelby2);
        System.out.println(hotelShelby2);

        // Creando un vuelo y agregandola a la lista de vuelos
        Vuelo vueloShelby2 = new Vuelo("2", "SH-2", new FechaCustom(2024, 10, 11), "10:30", "Springfield", "Shelbyville", proveedorTest, 999000, 20);
        vuelosBarSinSon2.add(vueloShelby2);
        System.out.println(vueloShelby2);

        // Creando un paquete de productos
        PaqueteTuristico paqueteTest2 = new PaqueteTuristico("1", "Paquete Para Bar SinSon", "Paquete de prueba 2", vuelosBarSinSon2, hotelesBarSinSon2, transportesTerrestreBarSinSon2, actividadesBarSinSon2);
        System.out.println(paqueteTest2);
        paqueteTest2.calcularTotal();

        System.out.println("===== Seccion Reserva 2=====");
        // Creando la reserva
        Reserva reservaTest2 = new Reserva("2", "Reserva del bar sin son 2", barsinson,barneygomez, paqueteTest2);
        barneygomez.aumentarVenta(); // + 1 reserva a la cantidad actual
        System.out.println(reservaTest2);
        // Paguemos la reserva
        reservaTest2.abonarReserva(120000);
        System.out.println(reservaTest2.getEstadoReserva()); // probando estado de la reserva al ser pagada
        
        // Agregamos la reserva al reporte
        System.out.println("===== Seccion Reporte con dos reservas===== ");
        reporteTest.agregarReserva(reservaTest2); // Agregamos la reserva numero 2
        reporteTest.reporteFull(); // Analizamos todo denuevo
        System.out.println(reporteTest.getTotalReservas() + " reserva(s)"); // Cuantas reservas se hicieron
        System.out.println(reporteTest.getMontoTotal() + "$ es el monto total en reservas"); // Valor total de todas las reservas en el reporte
        System.out.println(reporteTest.getMontoTotalPagado() + "$ es lo que se ha pagado.");
        System.out.println(reporteTest.getMontoTotalAdeudado() + "$ es lo que se debe.");
        System.out.println("Se encontraron en total : " + reporteTest.getCantidadActividades() + " actividade(s) reservada(s).");
        System.out.println("Se encontraron en total : " + reporteTest.getCantidadHoteles() + " hotele(s) reservado(s).");
        System.out.println("Se encontraron en total : " + reporteTest.getCantidadVuelos() + " vuelo(s) reservado(s).");
        System.out.println("Ejecutivos que han vendido : " + reporteTest.getEjecutivos());
        
    }

}
