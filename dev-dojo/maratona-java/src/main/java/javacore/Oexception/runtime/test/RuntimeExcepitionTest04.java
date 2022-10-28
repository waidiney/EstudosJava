package javacore.Oexception.runtime.test;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExcepitionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
        try {
            talvezLanceException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, IOException {
    }
}