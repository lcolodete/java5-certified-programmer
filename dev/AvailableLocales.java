import java.util.*;
class AvailableLocales
{
  public static void main(String... args)
  {
    List<Locale> locList = new ArrayList<Locale>(Arrays.asList(Locale.getAvailableLocales()));
    Collections.sort(locList, new ComparatorLocale());
    for (Locale l : locList)
    {
      System.out.println(">> "+l);
    }
  }
}

class ComparatorLocale implements Comparator<Locale>
{
  public int compare(Locale loc1, Locale loc2)
  {
    return loc2.toString().compareTo(loc1.toString());
  }
}
