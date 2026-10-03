import java.io.*;
class AuthenticationFailure extends Exception
{
    public AuthenticationFailure()
    {
        System.out.println("Invalid Password");

    }
}
class exTests
{
    public static void main (String args[]) throws IOException
    {
        try
        {
            String pass;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter password:");
            pass=br.readLine();
            if(pass.equals("rose"))
            System.out.println("Login Successful");
            else
            throw new AuthenticationFailure();

        }
        
            catch(AuthenticationFailure e)
            {
                System.out.println(e);
            }

    }
}