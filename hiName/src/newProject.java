public class newProject {
    public static void main(String[] args) {
        System.out.println(getRandomArray(100));
    }

    public static  void printArray (int[] a) {
        for (int n : a) {
            System.out.println(n);
        }
    }


    public static int[] getRandomArray (int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) Math.random() * 10;
        }
        for (int j = 0; j < length; j++) {
            System.out.println(j);
        }
        return numbers;
    }
}


//print out