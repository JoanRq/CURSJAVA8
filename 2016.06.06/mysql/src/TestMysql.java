import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMysql {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
          "jdbc:mysql://localhost/personas?useSSL=false&serverTimezone=CET",
          "root",
          "");
      String consultaSql="INSERT INTO autobus VALUES ('3401BCW', 55, 3)";
      Statement sentencia= conn.createStatement();

      sentencia.execute(consultaSql);
      System.out.println("Consulta executada");
/*   LECTURA
      String consultaSql="SELECT * FROM autobus";
      Statement sentencia= conn.createStatement();

      ResultSet rs = sentencia.executeQuery(consultaSql);
      System.out.println("Consulta executada");

      // PAS 3: ITEREM SOBRE LA BDD
      while (rs.next()) {
        String matricula = rs.getString("Matricula");
        int plazas = rs.getInt("plazas");
        int linea = rs.getInt("linea");
        System.out.println("Bus matricula " + matricula + ", Plazas: " + plazas + ", Linea" + linea);

      }
      rs.close();

*/

      sentencia.close();
      conn.close();

    } catch (Exception e) {
      System.out.print("ERROR"+e);
    }
  }
}