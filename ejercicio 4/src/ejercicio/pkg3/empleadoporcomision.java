package proyectoherencia3;

public class EmpleadoBaseMasComision {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        if(ventasBrutas<0.0)
        throw new IllegalArgumentException("Las ventas brutas deben de ser >= a 0.0 ");
        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
        throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0 ");
        if (salarioBase < 0.0)
        throw new IllegalArgumentException("El salario base debe ser >= 0.0 ");
        
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.salarioBase = salarioBase;
    }
    
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    
    public void establecerVentasBrutas(double ventasBrutas){
        if(ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben de ser >= a 0.0 ");
        this.ventasBrutas=ventasBrutas;
    }
    
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
    
    public void establecerTarifaComision(double tarifaComision){
        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0 ");
        this.tarifaComision=tarifaComision;
    }
    
    public double obtenerTarifaComison(){
        return tarifaComision;
    }
    
    public void establecerSalarioBase(double salarioBase){
        if (salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0 ");
        this.salarioBase=salarioBase;
    }
    
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    
    public double ingresos(){
        return salarioBase + (tarifaComision * ventasBrutas);
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: 2f",
                "empleado por comision con sueldo base", primerNombre, apellidoPaterno,
                "numero de seguro social", numeroSeguroSocial, "ventas brutas", ventasBrutas,
                "tarifa de comision", tarifaComision, "salario base", salarioBase);
    }
}