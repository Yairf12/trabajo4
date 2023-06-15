package proyectoherencia3;

public class ProyectoHerencia3 {

    public static void main(String[] args) {
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Bob","Lewis",
                "333-33-3333", 5000, .04, 300);
        System.out.println("Informacion del empleado obtenida por los metodos establecer: %n");
        System.out.printf("%n%s %s%n", "El primer nombre es: ", empleado.obtenerPrimerNombre());
        System.out.printf("%n%s %s%n", "El apellido es: ", empleado.obtenerApellidoPaterno());
        System.out.printf("%n%s %s%n", "El numero de seguro social es: ", empleado.obtenerNumeroSeguroSocial());
        System.out.printf("%n%s %.2f%n", "Las ventas brutas son: ", empleado.obtenerVentasBrutas());
        System.out.printf("%n%s %.2f%n", "La tarifa de comsion es: ", empleado.obtenerTarifaComison());
        System.out.printf("%n%s %.2f%n ", "El salario base es: ", empleado.obtenerSalarioBase());
        
        empleado.establecerSalarioBase(1000);
        
        System.out.printf("%n%s:%n%n5s%n","Informacion actualizada del empleado, obtenida mediante toString: ",
                empleado.toString());
    }  
}