package less2;

public class Main {
    public static void main(String[] args) {

    String[][] stringArr1 = {{"a","a","a","a"},
                            {"a","a","a","a"},
                            {"a","a","a","a"},
                            {"a","a","a","a"}};

    String[][] stringArr2 = {{"1","1","1","1"},
                             {"1","1","1","1"},
                             {"1","a","1","1"},
                             {"1","1","1","1"}};


    try {
        arraySizeControl(stringArr2);
    }catch (MyArraySizeException e){
        e.printStackTrace();
    }
    try {
        arrayTransformer(stringArr2);
    }catch (MyArrayDataException e){

        e.printStackTrace();
    }


        for (int j = 0; j < emptyArray.length ; j++) {
            System.out.println("\n");
            for (int i = 0; i < emptyArray.length; i++) {
                System.out.print(emptyArray[j][i] + " ");
            }
        }




        System.out.println("\nProgram end ok");
    }

    static boolean arrOk = false;

    static int[][] emptyArray = new int[4][4];

    public static void arraySizeControl(String[][] arr) throws MyArraySizeException {


        if(arr.length > 4 ){
            throw new MyArraySizeException("Array must be 4x4");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > 4){
                arrOk = false;
                throw new MyArraySizeException("Array must be 4x4 'array out of bounds' [" + i + "] " + "length is " + arr[i].length);
            }
        }

        System.out.println("Array size ok.");
        arrOk = true;

    }

    public static void arrayTransformer(String[][] arr) throws MyArrayDataException{
       int arrIndex = 0;
        if(arrOk){
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 try {
                     emptyArray[arrIndex][j] = Integer.parseInt(arr[arrIndex][j]);
                 }catch (IllegalArgumentException e){
                     throw new MyArrayDataException("The characters arr[" + i + "] " + "[" + j + "] " + " must be a number");
                }

            }
             arrIndex++;
         }
        }else{
            System.out.println("arr is not ok, give right arr");
        }


    }

}


