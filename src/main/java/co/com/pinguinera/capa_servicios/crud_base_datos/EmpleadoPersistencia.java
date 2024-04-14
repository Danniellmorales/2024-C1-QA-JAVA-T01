package co.com.pinguinera.capa_servicios.crud_base_datos;

import co.com.pinguinera.capa_datos.EmpleadoDAO;
import co.com.pinguinera.modelado.Empleado;

import java.sql.SQLException;
import java.util.List;

public class EmpleadoPersistencia extends AbstractBaseDatosCRUD<Empleado> {
    private final EmpleadoDAO empleadoDAO;

    public EmpleadoPersistencia(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    @Override
    public void insertar(Empleado empleado) throws SQLException {
        empleadoDAO.insertar(empleado);
    }

    @Override
    public List<Empleado> obtenerTodos() throws SQLException {
        return empleadoDAO.obtenerTodos();
    }

    @Override
    public void actualizar(Empleado empleado) throws SQLException {
        empleadoDAO.actualizar(empleado);
    }

    @Override
    public void eliminar(int id) throws SQLException {
        empleadoDAO.eliminar(id);
    }
}
