import ejercicio1.Empleado;
import ejercicio1.EmpleadoContratista;
import ejercicio1.EmpleadoPorHoras;
import ejercicio1.EmpleadoTiempoCompleto;
import ejercicio5.Estudiante;
import ejercicio5.Persona;
import ejercicio5.Staff;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Empleado empleado1 = new EmpleadoTiempoCompleto("Juan", 20000);
//        Empleado empleado2 = new EmpleadoPorHoras("Pedro", 5000, 8);
//        Empleado empleado3 = new EmpleadoContratista("Pablo", 2004, 11, 5500);
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
//        ejer2.Autor autor1= new ejer2.Autor("Joshua", "Bloch", "joshua@email.com", 'M');
//        System.out.println(autor1);
//        ejer2.Libro libro1 = new ejer2.Libro("Effective Java", 450, 150, autor1);
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
//        ejercicio3.Cliente cliente1 = new ejercicio3.Cliente("Orellano Pablo", "Pabiel@gmail.com", 50);
//        //  System.out.println(cliente1);
//        ejercicio3.Factura factura1 = new ejercicio3.Factura(5000, cliente1);
//        System.out.println(factura1);

/// ejecicio 4
//        ejercicio4.Circulo circulo1 = new ejercicio4.Circulo();
//        ejercicio4.Cilindro cilindro1 = new ejercicio4.Cilindro();
//        System.out.println(cilindro1);
//        System.out.println(cilindro1.getRadio());
//        System.out.println(cilindro1.getAltura());
//        System.out.println(cilindro1.area());
//        ejercicio4.Cilindro cilindro2 = new ejercicio4.Cilindro(5.0,10.0);
//        System.out.println(cilindro2);

/// ejercico 5
      Persona estudiante1 = new Estudiante(12345678, "Pablo", "Orellano", "pablo@mail.com",
              "Luro 1234", 2025,2500.25, "Monopatin");
      Persona estudiante2 = new Estudiante(28456731, "Juan", "Gomez", "juan@gmail.com",
                "San Martin 456", 2024, 3200.50, "Ingenieria");
      Persona estudiante3 = new Estudiante(36789124, "Maria", "Fernandez", "maria@gmail.com",
                "Belgrano 789", 2023, 2800.75, "Programacion");
      Persona estudiante4 = new Estudiante(42123456, "Lucas", "Rodriguez", "lucas@gmail.com",
                "Rivadavia 321", 2025, 3500.00, "Electromecanica");

      Persona staff1 = new Staff(32569874, "Jose", "Perez", "Jose@mail.com", "San martin 586",
              458965.24, "mañana");
      Persona staff2 = new Staff(28745163, "Carlos", "Gomez", "Carlos@mail.com", "Belgrano 742",
                389520.75, "tarde");

      Persona staff3 = new Staff(41632785, "Laura", "Fernandez", "Laura@mail.com", "Rivadavia 321",
                512680.40, "mañana");

      Persona staff4 = new Staff(35419862, "Miguel", "Rodriguez", "Miguel@mail.com", "Mitre 915",
                425730.90, "noche");

      Persona[] personas = new Persona[8];
      personas[0] = estudiante1;
      personas[1] = estudiante2;
      personas[2] = estudiante3;
      personas[3] = estudiante4;
      personas[4] = staff1;
      personas[5] = staff2;
      personas[6] = staff3;
      personas[7] = staff4;
        int cantidadEstudiantes = 0;
        int cantidadStaff = 0;
      for (int i = 0; i < personas.length; i++) {
          if (personas[i] instanceof Estudiante) {
            cantidadEstudiantes++;
        }
        if (personas[i] instanceof Staff) {
                cantidadStaff++;
            }
      }
        System.out.println(cantidadEstudiantes);
      System.out.println(cantidadStaff);

      double sumaCuota = 0;
      for (int i = 0; i < personas.length; i++) {
        if (personas[i] instanceof Estudiante) {
          sumaCuota = sumaCuota + ((Estudiante) personas[i]).getCuotaMensual();
        }
      }
      System.out.println(sumaCuota);
      System.out.println(estudiante1);
    }

}






