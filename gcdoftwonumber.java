import java.util.Scanner;
public class gcdoftwonumber {
    static int gcd(int x ,int y){

        if(x == y)
        return (x);
        if(x == 0)
        return(y);
        if(y == 0)
        return (x);
        if(x>y)
        return gcd(x-y,y);
        return gcd(x,y-x);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("gcd of two number is : " + gcd(x,y));
    }
}
