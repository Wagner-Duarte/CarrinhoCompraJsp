package com.wagner.teste.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

    private static String banco = "jdbc:postgresql://localhost:5432/projeto-teste?autoReconnect=true";

    private static String user = "postgres";
    private static String senha = "102030";
    private static Connection connection = null;


    public static Connection getConnection() {
        return connection;
    }

    static {
        connectDB();
    }


    public SingleConnection() {
        connectDB();
    }

    private static void connectDB() {

        try {

            if(connection == null) {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(banco, user, senha);
                connection.setAutoCommit(false);

            }

        }catch (Exception e) {

            e.printStackTrace();
        }
    }


}
