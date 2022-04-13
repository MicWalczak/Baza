import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){

        try {
            ResultSet result = QuerryExe.exeSelect("SELECT * FROM public.user");
                result.next();
            String userName = result.getString("Users");
            System.out.println(userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
