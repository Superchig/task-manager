import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class TaskManager extends JFrame
{
  public TaskManager()
  {
    super("TaskManager");
    TextPanel canvas = new TextPanel();
    setJMenuBar(new TaskManagerMenu(canvas));
    ControlPanel controls = new ControlPanel(canvas);
    Container c = getContentPane();
    c.add(canvas, BorderLayout.CENTER);
    c.add(controls, BorderLayout.SOUTH);
  }

  public static void main(String[] args)
  {
    TaskManager window = new TaskManager();
    window.setBounds(100, 100, 640, 480);
    window.setResizable(false);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
