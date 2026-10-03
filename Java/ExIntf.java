import java.util.*;
interface Roundshape
{
final double pi=3.14;
void findarea();
void findvolume();
}
class sphere implements Roundshape
{
Double area,radius;
Scanner sc=new Scanner(System.in);
public void findarea()
{
System.out.print("Enter Radius Of Sphere:");
radius=sc.nextDouble();
area=4*pi*radius*radius;
System.out.println("Area of Sphere:"+area);
}
public void findvolume()
{
System.out.print("Enter radius of sphere:");
radius=sc.nextDouble();
area=(4/3)*pi*(radius*radius*radius);
System.out.println("Volume of Sphere is:"+area);
}
}
class ExIntf
{
public static void main(String args[])
{
sphere s=new sphere();
s.findarea();
s.findvolume();
}
}