import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAll {

    public static void showTable(String table){
        try {
            ResultSet result = QuerryExe.exeSelect("SELECT * FROM public.\""+table+"\";");
            while (result.next()) {

                String userName = result.getString("User_Name");
                System.out.println(userName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
