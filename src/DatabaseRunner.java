public class DatabaseRunner {

    public static void main(String[] args) {

        Database database = new AdapterJavaByDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
