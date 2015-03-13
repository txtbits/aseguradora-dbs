package aseguradora;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleDriver;

public class ConnectOracle {

    private Connection conn = null;
    private PreparedStatement prst = null;
    private ResultSet rsst = null;

    private String host = null;
    private int port = 0;
    private String database = null;
    private String usn = null;
    private String pwd = null;

    public ConnectOracle(String host, int port, String database,
            String usn, String pwd) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.usn = usn;
        this.pwd = pwd;
        try {
            DriverManager.registerDriver(new OracleDriver());
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }

    public boolean connectDatbase() {
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port
                    + ":" + database, usn, pwd);
            System.out.println(" Parece ser que nos hemos conectado");
            conn.setAutoCommit(false);
            return true;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }
    }

    public boolean disconnectDatabase() {
        try {
            System.out.println("Nos hemos desconectado");
            conn.close();
            return true;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }
    }
    
    public PreparedStatement createStatement(String sql) {
        try {
            return conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        }
    }

    public void confirmar() {
        try {
            conn.commit();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
