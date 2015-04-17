package Interface;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Paneau extends  JPanel implements ActionListener
{
	// Cartes petites : 143/200
	// Carte grande 375/523
	// Background : 1366/726
	private ImageIcon bg;
	Toolkit tk =Toolkit.getDefaultToolkit();
	Dimension dimEcran = tk.getScreenSize();
	int larg = dimEcran.width;
	int haut = dimEcran.height;
	
	private ImageIcon dos;
		private JButton terrain1;
		private JButton imageAgrandie;
	
	public Paneau()
	{
		bg = new ImageIcon("background bonne taille"+1+".png");	// test concaténation
		dos = new ImageIcon("dos carte redi.png");
		setLayout(null);
		
		terrain1 = new JButton(new ImageIcon("gard.jpg"));
		terrain1.setBounds(larg/4-150, haut/2-100, 150, 200);
		this.add(terrain1);
		terrain1.setVisible(true);
		
		imageAgrandie = new JButton(new ImageIcon("dos carte.png"));
		imageAgrandie.setBounds(10, 250, 375, 523); // TO DO redimenssioner
		this.add(imageAgrandie);
		imageAgrandie.setVisible(false);
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(bg.getImage(), 0, 0, null);
		g.drawImage(dos.getImage(), larg-170, haut/2+30, null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==terrain1)
		{
			//imageAgrandie.setIcon(new ImageIcon(terrain1.getIcon()+"Big"));
		//	imageAgrandie.setVisible(true);

		// Supprimer .jpg : 
	//		String maString = "test.jpg";
//			maString = maString.substring(0, maString.length()-4);
		}
	}
}
