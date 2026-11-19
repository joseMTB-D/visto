package net.anime.visto.Service.Auth;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


@Slf4j
public class login {
    private static String sqlUser;
    private static String sqlPassword;
    private Connection dbConnection;

    /**
     * TODO mirar de utilizar JPA y hacer que se valide el usuario contra DB.
     * TODO a futuro se replicara la logica usando tokens
     * TODO tambien se tiene de crear la clase encargada de gestionar las Excepciones SQL
     * */
    private boolean validarUsuario(String usuario){
        boolean valido = false;
        try{
            sqlUser = "SELECT * FROM usuarios WHERE usuario = ?";
            ResultSet rs = (ResultSet) dbConnection.prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
            rs.next();

        }catch (SQLException e){
            log.error("[login-validarUsuario-ERROR]: {}", e.getMessage());
        }

        return valido;
    }
}
