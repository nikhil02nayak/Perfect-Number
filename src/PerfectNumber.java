public class PerfectNumber {
    public static boolean isPerfectNumber (int number)
    {
        if ( number < 1)
        {
            return false ;
        }
        int sumofdivisors = 0 ;
        for (int i = 1 ; i < number ; i++)
        {
            int factors = number % i ;
            if (factors == 0)
            {
                sumofdivisors += i ;

            }

        }
        return (sumofdivisors == number) ;
    }
}
