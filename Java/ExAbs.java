import java.util.*;
abstract class Roundshape
{
double radius;
final double pi=3.14;
abstract void findarea();
abstract void findvolume();
void disp()

{
System.out.println("This is an Example of Abstract Class");
}
}
class sphere extends Roundshape
{
Double area;
Scanner sc=new Scanner(System.in);
void findarea()
{
System.out.print("Enter radius of sphere:");
radius=sc.nextDouble();
area=4*pi*radius*radius;
System.out.println("Area of sphere is:"+area);
}
void findvolume()
{
System.out.print("Enter radius of sphere:");
radius=sc.nextDouble();
area=(4/3)*pi*(radius*radius*radius);
System.out.println("Volume of Sphere is:"+area);
}
}
class ExAbs
{
public static void main(String args[])
{
sphere s=new sphere();
s.disp();
s.findarea();
s.findvolume();
}
}