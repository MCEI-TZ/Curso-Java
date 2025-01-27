import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        // ** Sistema Sencillo para Recultar Empleados

        System.out.println("Sistema para Recutlar empleados");
        var scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo");
        var nombreCompleto = scanner.nextLine();

        System.out.println("Ingrese su edad");
        var edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el salario que estima ganar");
        var salarioEstimado = Double.parseDouble(scanner.nextLine());

        System.out.println("¿Es usted jefe de departamento? reponda con true o false");
        var esJefeDeDepartamento = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Datos del Empleado \n" + "nombre: "+nombreCompleto +"\nEdad: "+edad+"\nSalario: $%.2f ".formatted(salarioEstimado)+"\n ¿Es jefe de departamento: "+ esJefeDeDepartamento  );

    }
}
