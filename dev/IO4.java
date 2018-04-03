import java.io.*;

public class IO4
{
  public static void main(String[] args)
  {
//     try
//     {
      File file = new File("e:/mp3"); // just an object on the heap

      File[] ls = file.listFiles();
      
      for (File f : ls)
      {
        if (f.isDirectory())
          System.out.println("<DIR> "+f);
        else System.out.println(">> file: "+f);
      }
      
//     }
//     catch(IOException e)
//     {
//       System.out.println("Error in I/O operations");
//     }
  }
  

}

