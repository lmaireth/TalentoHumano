package modelo;

public class EmpleadoAdministrativo extends EmpleadoBase {

    private double bonificacion;

    public EmpleadoAdministrativo(String cedula, String nombre, double salrioBase, double bonificacion) {
        super(cedula, nombre, salrioBase);
        this.bonificacion = bonificacion;
    }

}
