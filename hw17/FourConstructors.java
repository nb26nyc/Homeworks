package HW17;

public class FourConstructors {
    String name;
    int age;
    double height;


    private FourConstructors(String name){
        this.name=name;
        System.out.println(name);
    }

    public FourConstructors(int age) {
        this.age = age;
        System.out.println(age);
    }

    FourConstructors(){
        System.out.println("Third Contructor");
    }

    protected FourConstructors( double height){
        this.height=height;
        System.out.println(height);
    }



    public static void main(String[] args) {

        FourConstructors first=new FourConstructors("Bob"); // private constructor accessible in same class only
        FourConstructors second=new FourConstructors(32); //public constructor accessible in same class,same package and diff class and diff package
        FourConstructors third=new FourConstructors(); //default constructor accessible in all classes inside same package
        FourConstructors fourth=new FourConstructors(6.2); //protected constructor accessible in all classes inside same package
    }
}
