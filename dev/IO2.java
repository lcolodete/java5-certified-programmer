import java.io.*;

public class IO2
{
  public static void main(String[] args)
  {
    try
    {
      File file = new File("fileWrite4.txt"); // just an object on the heap
      
      PrintWriter pw = getPrintWriterInstanceV2(file);
      
      pw.println("primeira linha");
      pw.println("nova linha");
      
      pw.flush();
      pw.close();
      
      FileReader fr = new FileReader(file);
      
      BufferedReader br = new BufferedReader(fr);

      String line = br.readLine(); 
      
      while (line != null)
      {
        System.out.println(line);
        line = br.readLine();
      }

    }
    catch(IOException e)
    {
      System.out.println("Error in I/O operations");
    }
  }
  
  static PrintWriter getPrintWriterInstanceV1(File file) throws IOException
  {
    System.out.println("getPrintWriterInstanceV1");
  
    FileWriter fw = new FileWriter(file);
      
    return new PrintWriter(fw);
  }

  static PrintWriter getPrintWriterInstanceV2(File file) throws IOException
  {
    System.out.println("getPrintWriterInstanceV2");
    return new PrintWriter(file);
  }

}

