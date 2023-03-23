import javax.swing.*;
import java.awt.event.*;

class calculator()
{
	public JFrame mainframe;
	public JButton b1,b2,b3,b4;
	public JTextField t1,t2;	
	public Calculator(int width, int height, string Title)
	{
		mainframe = new JFrame(Title);
		mainframe.setsize(width,height);
		mainframe.setVisible(true);
		
		mainframe.addWindowListener(this);
		
		b1 = new JButton("ADD");
		b1 = new JButton("ADD");
		b1 = new JButton("ADD");
		
		
	}
	public void windowClosing(WindowEvent obj)
	{
		System.exit(0);
	}
}


class MarvellousCalculator
{
	public static void main(string arg[])
	{
		Calculator cal = new Calculator(500,500,"Marvellous Window");
    }
}