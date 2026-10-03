class test
{
    double ar;
    static int a;
    String name,city;
    test(){
        System.out.println("Example Of Constructor Overloading->");
        System.out.println("This is Default Constructor......Executing First");
        System.out.println("This is a Parameterized Constructor");

    }
    test(String n,String c)
    {
        name=n;
        city=c;
    }
    void calarea(double radius)
    {
        ar=3.14*radius*radius;
        System.out.println("Area Of Circle:"+ar);
    }
    void calarea(double base,double height)
    {
        ar=0.5*base*height;
        System.out.println("Area Of traingel:"+ar);
    }
    static void disp()
    {
        a=10;
        System.out.println("a:"+a);

    }
}
class practical1
{
    public static void main(String args[])
    {
        test obj=new test();
        test obj1=new test("Ravi","Akola");
        System.out.println("Student Name:"+obj1.name+"\nStudent City:"+obj1.city);
        System.out.println("Example Of Method Overloading->");
        obj.calarea(5);
        obj.calarea(8.5);
        System.out.println("Example of Static Method->");
        test.disp();
        
    }
}