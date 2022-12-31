import swingwindows.SwingMain;
import dbmsfunctions.DbmsFunc;

import static dbmsfunctions.DbmsFunc.connect;

public class Main {
    public static void main(String[] args) {
//        connect();
        String query = String.format("INSERT INTO students(RegisterNumber, Name, Mark1, Mark2, Mark3) VALUES ('%s', '%s', %d, %d, %d);", "vml21cs129", "Navaneeth", 100, 100, 100);
        System.out.println(query);
        new SwingMain().setVisible(true);
    }
}