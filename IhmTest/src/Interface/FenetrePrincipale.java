package Interface;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FenetrePrincipale extends JFrame
{
	Toolkit tk =Toolkit.getDefaultToolkit();
	Dimension dimEcran = tk.getScreenSize();
	int larg = dimEcran.width;
	int haut = dimEcran.height;
	private Paneau pan;
	public FenetrePrincipale()
	{
		setTitle("Affichage Partie");
		setSize(larg,haut);
		pan = new Paneau();
		getContentPane().add(pan);
	}
	
}

