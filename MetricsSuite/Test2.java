//This function approximates the sine of x in m iterations

//Treat Power and Factorial as operators

public class Test2 {
    double sinx(double x, int m){

        int n;

        double sx = 0, d, num, t, p;


        for(n=1; n < m; n++){

            num = Power(-1.0, n-1);

            d = Factorial(2*n-1);

            t = num /d;

            p = Power(x,(2*n-1));


            sx = sx + t*p;

        }

        return sx;
    }

}
