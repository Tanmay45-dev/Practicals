class base
{
void display()
{
System.out.println("This Is Base Class");
}
}
class derived extends base
{
void display()
{
super.display();
System.out.println("This Is Derived Class");
}
}

class EXM01
{
public static void main(String[]args)
{
derived obj=new derived();
obj.display();
}
}