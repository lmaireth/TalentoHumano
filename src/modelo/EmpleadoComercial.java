package modelo;

public class EmpleadoComercial extends EmpleadoBase{

    public EmpleadoComercial(String cedula, String nombre, double salarioBase, double porcentajeComision) {

        super(cedula, nombre, salarioBase);
        this.porcentajeComision = porcentajeComision;
    }
}
