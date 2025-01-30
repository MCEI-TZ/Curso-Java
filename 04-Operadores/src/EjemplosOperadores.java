import java.util.Scanner;

public class EjemplosOperadores {
    public static void main(String[] args) {
        //*Determinar si esta dentro de cierto rango
        var scanner = new Scanner(System.in);

        System.out.println("---------Ejercicio Determinar numero dentro de cierto rango---------");

        System.out.print("Ingrese un numero inicial: ");
        int numInicial = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese un numero final: ");
        int numFinal = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese un numero a verificar tu rango: ");
        int numVerificar = Integer.parseInt(scanner.nextLine());

        boolean estaDentroDeRango = numVerificar >= numInicial && numVerificar <= numFinal;
        System.out.println("Tu numero: " + (estaDentroDeRango?"Esta dentro del rango": "Esta fuera del rango"));

        System.out.println("Tu numero esta fuera del rango?" + (!estaDentroDeRango ? "Si":"No"));


        System.out.println("---------Ejercicio Tienda de Descuento VIP --------------------------------");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        System.out.println("¿Cuantos productos compraste hoy?");
        int numProductos = Integer.parseInt(scanner.nextLine());

        System.out.println("Tienes membresia? (true , false)");
        boolean esVIP = Boolean.parseBoolean(scanner.nextLine());

        boolean obtineDescuento = numProductos >= NO_PRODUCTOS_DESCUENTO && esVIP;

        System.out.println(" Usted :" + (obtineDescuento?"Tiene un descuento del 10%":"No tiene un descuento"));

        System.out.println("---------Sistema prestamos de libros --------------------------------");

        System.out.println("Usted tiene credencial de estudiante? (true,false)");
        boolean tieneCredencialEstudiante = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(" Usted vive a más de 3km? (true, false)");
        boolean viveADistancia = Boolean.parseBoolean(scanner.nextLine());

        boolean puedePrestarLibro = tieneCredencialEstudiante || viveADistancia;
        System.out.println("El libro de la bibilteca : " + (puedePrestarLibro?"Se puede prestar":"No se puede prestar"));

        //*Calculo de area con Rectangulo
        System.out.println("---------Calculadora de Area y Perimetro de un rectangulo --------------------------------");
        System.out.print("Ingrese la base del rectangulo: ");
        double base = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = Double.parseDouble(scanner.nextLine());

        double area = base * altura;
        double perimeto = 2* (base + altura);

        System.out.println("area = " + area);
        System.out.println("perimeto = " + perimeto);
    }
}
