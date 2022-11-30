package less2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    String[][] arr;

    public MyArraySizeException(String[][] arr) {
        this.arr = arr;
    }

    public MyArraySizeException(String message) {
        super(message);
    }


}
