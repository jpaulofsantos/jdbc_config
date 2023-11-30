import db.DB;

import java.sql.Connection;

public class MainProgram {
    public static void main(String[] args) {

        Connection connection = DB.getConnection(); //chamando a conexão com o banco da classe DB
        DB.closeConnection();

    }
}
