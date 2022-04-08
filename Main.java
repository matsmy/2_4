import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);
    while(true)
    {
      char znak = s.next().charAt(0);
      if(znak=='q') System.out.println(znak);
      else break;
    }
    s.close();
  }
}