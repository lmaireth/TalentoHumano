package controlador;

import modelo.EmpleadoAdministrativo;
import modelo.EmpleadoBase;
import modelo.RepositorioEmpleados;

import java.util.ArrayList;


public class EmpleadoControlador {

    public static final String[] TIPOS_EMPLEADO = {"Operativo", "Administrativo"};

    private final RepositorioEmpleados repositorio;
    private final ArrayList<String> historial;

    public EmpleadoControlador() {
        repositorio = new RepositorioEmpleados();
        historial = new ArrayList<>();
        cargarDatosDePrueba();
    }


}
