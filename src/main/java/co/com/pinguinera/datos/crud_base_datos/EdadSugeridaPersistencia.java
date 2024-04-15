package co.com.pinguinera.datos.crud_base_datos;

import co.com.pinguinera.datos.EdadSugeridaDAO;
import co.com.pinguinera.datos.model.EdadSugerida;

import java.sql.SQLException;
import java.util.List;

public class EdadSugeridaPersistencia extends AbstractBaseDatosCRUD<EdadSugerida> {
    private final EdadSugeridaDAO edadSugeridaDAO;

    public EdadSugeridaPersistencia(EdadSugeridaDAO edadSugeridaDAO) {
        this.edadSugeridaDAO = edadSugeridaDAO;
    }

    @Override
    public void insertar(EdadSugerida edadSugerida) throws SQLException {
        edadSugeridaDAO.insertar(edadSugerida);
    }

    @Override
    public List<EdadSugerida> obtenerTodos() throws SQLException {
        return edadSugeridaDAO.obtenerTodos();
    }

    @Override
    public void actualizar(EdadSugerida edadSugerida) throws SQLException {
        edadSugeridaDAO.actualizar(edadSugerida);
    }

    @Override
    public void eliminar(int id) throws SQLException {
        edadSugeridaDAO.eliminar(id);
    }
}