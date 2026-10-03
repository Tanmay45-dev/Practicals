class base
{
void display()
{
print("Base class method");
}
}
class derived extends base
{
void display()
{
super.display();
print("Derived class method");
}
}

class EXM01
{
public static void main(String[]args)
{
derived obj=new derived();
obj.display();
}