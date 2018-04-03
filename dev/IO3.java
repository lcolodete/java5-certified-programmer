import java.io.*;

public class IO3
{
  public static void main(String[] args)
  {
    try
    {
      File file = new File("myDir"); // just an object on the heap

      System.out.println("file exists? "+file.exists());
      
      System.out.println("file isFile? "+file.isFile());
      
      System.out.println("file isDirectory? "+file.isDirectory());
      
      file.mkdir();
      
      System.out.println("file exists? "+file.exists());
      
      //Cria um arquivo dentro do diretorio myDir
      
      File file2 = new File(file, "myfile.txt");
      
      System.out.println("file2 exists? "+file2.exists());
      
      file2.createNewFile();
      
      System.out.println("file2 exists? "+file2.exists());

      File newDir = new File("newDir2");
      boolean renameResult = file.renameTo(newDir);
      System.out.println("renameResult="+renameResult);
      
    }
    catch(IOException e)
    {
      System.out.println("Error in I/O operations");
    }
  }
  

}

