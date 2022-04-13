public class AddToDb {
    public static void Add(String Name) {
            QuerryExe.exeQuerry("INSERT INTO public.\"Users\"(\n" +
                    " \"User_Name\")\n" +
                    "\tVALUES  ('"+Name+"') ;");

    }
}
