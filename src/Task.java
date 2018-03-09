// Christopher Chang, Period 1, 3/9/2018
// write a class that uses the interfaces Priority, Complexity
// and Comparable (from java library)

public class Task implements Priority, Complexity, Comparable<Task>
{
  // instance fields
  private int priority, complexity;
  private String description;
  
  // constructor - no arg, full arg, String arg
  public Task()
  {
    priority = Priority.MED_PRIORITY;
    complexity = Complexity.MED_COMPLEXITY;
    description = "Unknown task";
  }
  
  public Task(String description)
  {
    this.description = description;
    priority = Priority.MED_PRIORITY;
    complexity = Complexity.MED_COMPLEXITY;
  }
  
  public Task(String description, int priority, int complexity)
  {
    this.description = description;
    this.priority = priority;
    this.complexity = complexity;
  }
  
  // methods implemented from the interfaces
  public void setPriority(int priority)
  {
    this.priority = priority;
  }
  
  public int getPriority()
  {
    return priority;
  }
  
  public void setComplexity(int complexity)
  {
    this.complexity = complexity;
  }
  
  public int getComplexity()
  {
    return complexity;
  }
  
  public int compareTo(Task other)
  {
    int rating = (10 * priority) + (complexity - 1);
    int otherRating = (10 * other.priority) + (other.complexity - 1);
    return otherRating - rating;
  }
  
  // toString
  public String toString()
  {
    return description + ": (" + priority + ", " + complexity + ")";
  }
  
  public static void main(String[] args)
  {
    java.util.ArrayList<Task> taskList = new java.util.ArrayList<Task>();
    Task t1 = new Task("Web Browser", Priority.HIGH_PRIORITY, Complexity.HIGH_COMPLEXITY);
    Task t2 = new Task("Calculator");
    Task t3 = new Task("Text Editor", Priority.HIGH_PRIORITY, Complexity.MED_COMPLEXITY);
    
    System.out.println("t1 - " + t1);
    System.out.println("Web Browser compared to Calculator: " + t1.compareTo(t2));
    System.out.println("Calculator compared to Web Browser: " + t2.compareTo(t1));
    System.out.println("Web Browser compared to Text Editor: " + t1.compareTo(t3));
    
    System.out.println("------------------------");
    taskList.add(t1);
    taskList.add(t2);
    taskList.add(t3);
    System.out.println("taskList pre-sort: " + taskList);
    java.util.Collections.sort(taskList);
    System.out.println("taskList post-sort: " + taskList);
  }
}