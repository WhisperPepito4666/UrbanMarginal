package Vue;

import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Arene extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel FenetreArene;
	private JTextField saisieTchat;
	private JTextArea afficheTchat;
	/**
	 * Create the frame.
	 */
	public Arene() {
		// Dimension de la frame en fonction de son contenu
		this.getContentPane().setPreferredSize(new Dimension(800, 600 + 25 + 140));
	    this.pack();
	    // interdiction de changer la taille
		this.setResizable(false);
																																																																																											
		
		setTitle("Arena");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FenetreArene = new JPanel();
		setContentPane(FenetreArene);
		FenetreArene.setLayout(null);
		
		JLabel lblFond=new JLabel("");
		lblFond.setBounds(0,0,800,600);
		String chemin="images/fonds/fondarene.jpg";
		URL resource=getClass().getClassLoader().getResource(chemin);
		lblFond.setIcon(new ImageIcon(resource));
		FenetreArene.add(lblFond);
		
		JTextField saisieTchat=new JTextField();
		saisieTchat.setBounds(0,600,800,25);
		FenetreArene.add(saisieTchat);
		
		JScrollPane conteneurTchat=new JScrollPane();
		conteneurTchat.setBounds(0,625,800,140);
		conteneurTchat.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		FenetreArene.add(conteneurTchat);
		
		JTextArea affichageTchat=new JTextArea();
		conteneurTchat.setViewportView(affichageTchat);
		
	}

}
