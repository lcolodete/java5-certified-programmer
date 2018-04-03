import java.io.*;

public class IO1
{
  public static void main(String[] args)
  {
    try
    {
      File file = new File("fileWrite2.txt"); // just an object on the heap
      
      FileWriter fw = new FileWriter(file);
      
      System.out.println("file exists ? "+file.exists());
      
      fw.write("teste de escrita em arquivo");
      
      fw.flush();
      fw.close();
      
      char[] in = new char[50];
      FileReader fr = new FileReader(file);
      
      int size = fr.read(in);
      System.out.println("Bytes read from file = "+size);
      
      for (char c : in)
      {
        System.out.print(c);
      }
      
      fr.close();
    }
    catch(IOException e)
    {
      System.out.println("Error in I/O operation");
    }
  }
}
