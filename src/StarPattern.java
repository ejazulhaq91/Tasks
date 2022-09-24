public class StarPattern {
    public static void main(String[] args) {
        // Left Right Angle Triangle

        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


        // Right Angle Triangle

        for(int i = 5; i>0; i--)
        {
            for(int j = 0; j<5; j++)
            {
                if (j < i-1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }

//          Diamond Shape
//
        for(int i = 6; i > 0; i--)
        {
            for(int j = 0; j < 6; j++)
            {
                if( i < j)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                if( i < j)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i = 6; i > 0; i--)
        {
            for(int j = 0; j <= 6; j++)
            {
                if( i <= j)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
