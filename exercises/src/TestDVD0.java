import java.util.*;
public class TestDVD0 {
  ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();

  public static void main(String[] args) {
    new TestDVD0().go();
  }

  public void go() {
    populateList();
    System.out.println("lista inserida");
    System.out.println(dvdlist);
    Collections.sort(dvdlist);     // ordena por titulo (Comparable)
    System.out.println("ordenada por titulo");
    System.out.println(dvdlist);
  }

  public void populateList() {
     // create DVDInfo instances, and
     // populate the ArrayList dvdlist with these instances

     dvdlist.add(new DVDInfo("Indiana Jones", "acao", "Harrison Ford"));
     dvdlist.add(new DVDInfo("Clube da Luta", "acao", "Edward Norton"));
     dvdlist.add(new DVDInfo("Star Wars", "sci-fi", "Mark Hammil"));
     dvdlist.add(new DVDInfo("Hellboy", "sci-fi", "Ron Perlman"));
     dvdlist.add(new DVDInfo("Lost in Translation", "comedia", "Bill Murray"));
     System.out.println("populateList... ok");
  }
}

class DVDInfo implements Comparable<DVDInfo> {
  String title;
  String genre;
  String leadActor;
  DVDInfo(String t, String g, String a) {
    title = t;  genre = g;  leadActor = a;
  }
  public String toString() {
    return title + " " + genre + " " + leadActor + "\n";
  }
  public int compareTo(DVDInfo d) {    
    return title.compareTo(d.getTitle());  
  }
  public String getTitle() {
    return title;
  }
  // getters and setter go here
}

