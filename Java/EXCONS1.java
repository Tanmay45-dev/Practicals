class EXCONS
{
int n1,n2,sum;

EXCONS()
{
System.out.println("This Is Default Constructor");
n1=10;
n2=5;
}
void cal()
{
sum=n1+n2;
System.out.println("Addition is"+sum);
}
}

class EXCONS1
{
public static void main(String[]args)
{
EXCONS obj=new EXCONS();
obj.cal();
}
}