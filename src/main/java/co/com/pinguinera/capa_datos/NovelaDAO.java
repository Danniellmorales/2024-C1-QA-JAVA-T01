package co.com.pinguinera.capa_datos;

import co.com.pinguinera.capa_datos.conexionBD.ConexionBD;
import co.com.pinguinera.modelado.publicaciones.Novela;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NovelaDAO {

    private static final String CONSULTA_NOVELAS = "SELECT * FROM Publicacion WHERE tipo_publicacion = 'NOVELA'";

    public List<Novela> obtenerTodasLasNovelas() throws SQLException {
        List<Novela> novelas = new ArrayList<>();

        Connection conexion = ConexionBD.conectar();
        try (PreparedStatement statement = conexion.prepareStatement(CONSULTA_NOVELAS);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                // Crear una instancia de Novela
                Novela novela = new Novela(
                        resultSet.getString("Titulo"),
                        resultSet.getString("autor"),
                        resultSet.getInt("num_paginas"),
                        resultSet.getInt("cant_ejemplares"),
                        resultSet.getInt("cant_prestados"),
                        resultSet.getInt("cant_disponible"),
                        null, // áreas
                        null  // edades
                );

                // Añadir la novela a la lista
                novelas.add(novela);
            }
        }

        return novelas;
    }
}