package Vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel FenetreEntreeJeu;
	
	private void btnStart_Click() {
		(new Arene()).setVisible(true);
		this.dispose();
	}
	
	private void btnConnect_Click() {
		(new ChoixJoueur()).setVisible(true);
		this.dispose();
	}
	
	private void btnExit_Click() {
		System.exit(0);
	}
	
	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		FenetreEntreeJeu = new JPanel();
		FenetreEntreeJeu.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(FenetreEntreeJeu);
		FenetreEntreeJeu.setLayout(null);

		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_Click();
			}
		});
		
		btnStart.setBounds(292, 28, 89, 23);
		FenetreEntreeJeu.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_Click();
			}
		});
		btnConnect.setBounds(292, 82, 89, 23);
		FenetreEntreeJeu.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_Click();
			}
		});
		btnExit.setBounds(292, 116, 89, 23);
		FenetreEntreeJeu.add(btnExit);
		
		JLabel lbl1 = new JLabel("Start a server :");
		lbl1.setBounds(57, 32, 83, 14);
		FenetreEntreeJeu.add(lbl1);
		
		JLabel lbl2 = new JLabel("Connecting an existing server :");
		lbl2.setBounds(57, 57, 163, 14);
		FenetreEntreeJeu.add(lbl2);
		
		JLabel lblAdresseIP = new JLabel("IP server :");
		lblAdresseIP.setBounds(57, 82, 58, 14);
		FenetreEntreeJeu.add(lblAdresseIP);
		
		JTextArea txtAdresseIP = new JTextArea();
		txtAdresseIP.setText("127.0.0.1");
		txtAdresseIP.setBounds(125, 77, 75, 22);
		FenetreEntreeJeu.add(txtAdresseIP);
	}
}
