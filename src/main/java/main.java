import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto("Juan", 20000);
        Empleado empleado2 = new EmpleadoPorHoras("Pedro", 5000, 8);
        Empleado empleado3 = new EmpleadoContratista("Pablo", 2004, 11, 5500);
        Scanner sc = new Scanner(System.in);
//        int opcion=0;
//
//        while (opcion != 3) {
//            System.out.println("Ingrese 1 para ver nombre de empleado");
//            System.out.println("Ingrese 2 para ver salarios");
//            System.out.println("Ingrese 3 para salir");
//            System.out.println("Opcion elegida: ");
//            opcion = sc.nextInt();
//            switch (opcion) {
//                case 1:
//                    System.out.println("Mostrar empleados: ");
//                    System.out.println(empleado1.getNombre());
//                    System.out.println(empleado2.getNombre());
//                    System.out.println(empleado3.getNombre());
//                    break;
//                case 2:
//                    System.out.println("Salario actual: "+ empleado1.calcularPago());
//                    System.out.println("Salario actual: "+ empleado2.calcularPago());
//                    System.out.println("Salario actual: "+ empleado3.calcularPago());
//                    break;
//                case 3:
//                    System.out.println("Gracias por participar");
//                     break;
//                default:
//                        System.out.println("Opcion Invalida");
//            }
//        }
///ejercio 2
//        Autor autor1= new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
//        System.out.println(autor1);
//        Libro libro1 = new Libro("Effective Java", 450, 150, autor1);
//        System.out.println(libro1);
//        libro1.setPrecio(500);
//        libro1.setStock(200);
//        System.out.println(libro1);
//        System.out.println(libro1.getAutor().getNombre());
//        System.out.println(libro1.getAutor().getApellido());
//        System.out.println(libro1.getAutor().getEmail());
//        System.out.println(libro1.getAutor().getGenero());
//        libro1.mostrarInfo();
//

/////ejecicio 3
//        Cliente cliente1 = new Cliente("Orellano Pablo", "Pabiel@gmail.com", 50);
//        //  System.out.println(cliente1);
//        Factura factura1 = new Factura(5000, cliente1);
//        System.out.println(factura1);

        /// ejecicio 4
        Circulo circulo1 = new Circulo(1, "rojo");
        Cilindro cilindro1 = new Cilindro(1, circulo1);
        System.out.println(cilindro1);
    }
}






