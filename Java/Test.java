import java.util.*;

class Test
{
public static void main(String[]args)
{
HashSet<String> h=new HashSet<String>();

h.add("India");
h.add("Australia");
h.add("South Africa");
h.add("India");

System.out.println(h);

System.out.println("list Contains India or Not"+h.contains("India"));

h.remove("Australia");

System.out.println(h);
}
}
