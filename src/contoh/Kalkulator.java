package contoh;

public class Kalkulator {
    public int tambah(int x, int y){
        return x + y;
    }
    
    // Method ini memungkinkan terjadi sebuah ArithmeticException
    public double bagi(int x, int y) {
        return x / y;
    }
}
