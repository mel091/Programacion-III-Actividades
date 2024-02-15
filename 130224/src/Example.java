import javax.swing.JFrame;

public class Example 
{

	public static void main(String[] args) 
	{
		JFrame ventana = new JFrame("Example"); //creamos obj con su nombre
		ventana.setVisible(true);
		
		ventana.setSize(200, 200);
		ventana.setLocation(100, 100);
		
		ventana.setLocationRelativeTo(null);
		
		ventana.setResizable(false);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //deja de correr al cerrarla
		
		System.out.println("hi");

	}

}
