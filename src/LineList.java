// create LineList class for Shuffler Lab
// one field, an ArrayList of Strings named list
// one constructor, no args, initialize ArrayList to unspecified capacity
// methods:
// int size() - returns number of lines in the list
// String get(int k) - returns the line with the index k from list
// void add(String line) - appends line at the end of the list
// String remove(int k) - removes and returns the kth element
// void move(int index, int newIndex) - move element, shift list if necessary
// void shuffle() - shuffles list of lines randomly
// create a "helper" or support method swapLines(int j, int k)

import java.util.ArrayList;

public class LineList
{
  private ArrayList<String> list;
  
  public LineList()
  {
    list = new ArrayList<String>();
  }
  
  public int size()
  {
    return list.size();
  }
  
  public String get(int k)
  {
    return list.get(k);
  }
  
  public void add(String line)
  {
    list.add(line);
  }
  
  public String remove(int k)
  {
    return list.remove(k);
  }
  
  public void move(int index, int newIndex)
  {
    String line = list.remove(index);
    list.add(newIndex, line);
  }
  
  private void swapLines(int j, int k)
  {
    String oldK = list.get(k);
    list.set(k, list.get(j));
    list.set(j, oldK);
  }
  
  public void shuffle()
  {
    for (int n = list.size(); n >= 2; n--)
    {
      int random = (int)(Math.random() * n);
      swapLines(random, n-1);
    }
  }
}