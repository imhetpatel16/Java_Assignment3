import java.util.Scanner;
public class Ass4main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int p= sc.nextInt();
        System.out.println("Enter the second value:");
        int q=sc.nextInt();
        Ass4 a=new Ass4();
        a.sample1(p,q);
        child c = new child();
        c.sample1(p,q);
    }
}
