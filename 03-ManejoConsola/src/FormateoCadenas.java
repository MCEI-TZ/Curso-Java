import java.util.Scanner;

public class FormateoCadenas {
    public static void main(String[] args) {
        //* Formateo de cadenas
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        var nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        var edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese su salario");
        var salario = Double.parseDouble(scanner.nextLine());

        //* Formateo con String.format()
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f",nombre,edad,salario);
        System.out.println(mensaje);

        //* Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n",nombre,edad,salario);

        //* Formateo con text block
        var numeorEmpleado = 13;
        mensaje = """
                \t***Detalle Persona***
                -----------------------------
                Nombre:\s%s
                Numero de Empleado: %04d
                Edad:\s%d
                Salario:\s$%.2f%n
                
                  """.formatted(nombre,numeorEmpleado, edad, salario);
        System.out.println(mensaje);

        System.out.printf(
                "\t***Detalle Persona***\n" +
                "------------------------\n" +
                "Nombre:\t%s\n" +
                "Numero de Empleado:\t%04d\n" +
                "Edad:\t%d\n" +
                "Salario:\t$%.2f\n",
                nombre, numeorEmpleado, edad, salario
        );
    }
}
