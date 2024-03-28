import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Obtener fecha y hora
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);

        int opcion = 3;
        while (opcion != 4) {
            Date date = new Date();
            String fecha_bonita = formatter.format(date);
            limpiar_consola();

            System.out.println("Sistema para el control de un motor de corriente directa");
            System.out.println("Noriega Encinas Luis Angel");
            System.out.println(fecha_bonita);

            System.out.println("Menu");
            System.out.println("1. Girar en sentido horario");
            System.out.println("2. Girar en sentido antihorario");
            System.out.println("3. Detener el motor");
            System.out.println("4. Salir");

            switch (opcion) {
                case 1:
                    System.out.println("Estado del motor: Girando en sentido horario");
                    break;
                case 2:
                    System.out.println("Estado del motor: Girando en sentido antihorario");
                    break;
                case 3:
                    System.out.println("Estado del motor: Detenido");
                    break;
                case 4:
                    opcion = 4;
                    break;
                default:
                    System.out.println("Introduzca una opcion valida");
                    break;
            }

            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
        }
        System.out.println("Saliendo...");
    }
    public static void limpiar_consola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
    }
}