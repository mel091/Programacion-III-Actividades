import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame
{
	public Ventana()
	{
		this.setVisible(true);
		
		this.setSize(200, 200);
		this.setLocation(100, 100);
		
		this.setLocationRelativeTo(null); 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		System.out.println("hi"); //name
		
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(750,750));
		this.setResizable(true);
			
		this.IniciarComponentes();
	}
	
	public void IniciarComponentes()
	{
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.red);
		this.add(login);
	}
	

}
