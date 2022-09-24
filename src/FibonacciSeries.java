public class FibonacciSeries {

    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        for(int i=0; i<10; i++){
            if(i == 0)
            {
                System.out.println(firstNumber + "\t");
                continue;
            }
            else if (i == 1)
            {
                System.out.println(secondNumber + "\t");
                continue;
            }

            nextNumber = firstNumber + secondNumber;
            System.out.println(nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
