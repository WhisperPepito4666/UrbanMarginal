package Vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ChoixJoueur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel FenetreChoixJoueur;
	
	private void mouse_Clicked_Gauche() {
		System.out.println("précédent");
	}
	
	private void mouse_Clicked_Droite() {
		System.out.println("suivant");
	}
	
	private void mouse_Clicked_Go() {
		(new Arene()).setVisible(true);
		this.dispose();
	}

	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		// Dimension de la frame en fonction de son contenu
		this.getContentPane().setPreferredSize(new Dimension(800, 600 + 25 + 140));
	    this.pack();
	    // interdiction de changer la taille
		this.setResizable(false);
																																																																																											
		
		setTitle("Choice");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 314);
		FenetreChoixJoueur = new JPanel();
		FenetreChoixJoueur.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(FenetreChoixJoueur);
		FenetreChoixJoueur.setLayout(null);
		
		JLabel lblFond=new JLabel("");
		lblFond.setBounds(0,0,400,275);
		String chemin="images/fonds/fondchoix.jpg";
		URL resource=getClass().getClassLoader().getResource(chemin);
		lblFond.setIcon(new ImageIcon(resource));
		FenetreChoixJoueur.add(lblFond);
		
		JLabel lblFlecheGauche = new JLabel("New label");
		lblFlecheGauche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouse_Clicked_Gauche();
			}
		});
		lblFlecheGauche.setBounds(65, 146, 33, 43);
		FenetreChoixJoueur.add(lblFlecheGauche);
		
		JLabel lblFlecheDroite = new JLabel("New label");
		lblFlecheDroite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouse_Clicked_Droite();
			}
		});
		lblFlecheDroite.setBounds(295, 146, 33, 43);
		FenetreChoixJoueur.add(lblFlecheDroite);
		
		JLabel lblGo = new JLabel("New label");
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouse_Clicked_Go();
			}
		});
		lblGo.setBounds(305, 196, 70, 65);
		FenetreChoixJoueur.add(lblGo);
	}
}
