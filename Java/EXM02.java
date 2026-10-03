class base
{
int a;
}

class derived extends base
{
int a;

void display()
{
a=10;
super.a=5;

System.out.println("a="+a);
System.out.println("Super.a="+super.a);
}
}
class EXM02
{
public static void main(String[]args)
{
derived obj=new derived();
obj.display();
}
}
