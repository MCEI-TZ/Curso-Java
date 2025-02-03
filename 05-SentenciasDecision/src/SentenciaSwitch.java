import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        //* Sentencia switch
        var scanner = new Scanner(System.in);

        System.out.println("Ingrese el número del día de la semana: ");
        var diaSemana = Integer.parseInt(scanner.nextLine());

        //* Sentencia switch en Java (Vieja Sintaxis)
        switch (diaSemana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }

        //* Sentencia switch en Java (Nueva Sintaxis)

        System.out.println("Ingrese el número del día de la semana: ");
        var diaSemana2 = Integer.parseInt(scanner.nextLine());

        switch (diaSemana2) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido");
        }

    }
}
