class EXCONS
{
int n1,n2,sum;

EXCONS(int x,int y)
{
System.out.println("This Is parameterized Constructor");
n1=x;
n2=y;
}
void cal()
{
sum=n1+n2;
System.out.println("Addition is"+sum);
}
}

class EXCONS2
{
public static void main(String[]args)
{
EXCONS obj=new EXCONS(10,20);
obj.cal();
}
}