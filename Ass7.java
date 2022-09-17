interface A{
    public void Details();
    default void Address(){
        System.out.println("Address:-\n Prince residency-234,\n Mehlav");
    }
}
public class Ass7 implements A
{
    @Override
    public void Details() {
        System.out.println("Details:-");
        System.out.println("Name:Patel Het R");
        System.out.println("ID NO.: 21CE091");
        System.out.println("College: CSPIT");
        System.out.println("Branch: Computer Engineering");
        System.out.println("Current sem: 3");
    }

    public static void main(String[] args) {
        Ass7 p =new Ass7();
        p.Details();
        p.Address();
    }
}
