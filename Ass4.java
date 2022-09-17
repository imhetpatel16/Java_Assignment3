public class Ass4
{
    void sample1(int p,int q){
        System.out.println("In parent class Method");
        System.out.println("p+q="+(p+q));
    }
}
class child extends Ass4{
    void sample1(int p,int q){
        System.out.println("In child class method");
        System.out.println("p-q="+(p-q));
    }
}
