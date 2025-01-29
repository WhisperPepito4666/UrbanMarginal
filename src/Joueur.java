/**
 * Gestion des joueurs
 *
 */
public class Joueur extends Objet {

	/**
	 * vie de départ pour tous les joueurs
	 */
	private static final int MAXVIE = 10 ;
	/**
	 * gain de points de vie lors d'une attaque
	 */
	private static final int GAIN = 1 ; 
	/**
	 * perte de points de vie lors d'une attaque
	 */
	private static final int PERTE = 2 ; 
	
	/**
	 * vie du joueur
	 */
	private int pv=MAXVIE;
	
	/**
	 * pseudo saisi
	 */
	private String pseudo ;
	/**
	 * n° correspondant au personnage (avatar) pour le fichier correspondant
	 */
	private int numPerso ; 
	/**
	 * instance de JeuServeur pour communiquer avec lui
	 */
	private JeuServeur jeuServeur ;
	/**
	 * numéro d'�tape dans l'animation (de la marche, touché ou mort)
	 */
	private int etape ;
	/**
	 * la boule du joueur
	 */
	private Boule boule ;
	
	/**
	 * Constructeur
	 */
	public Joueur() {
	}

	/**
	 * Initialisation d'un joueur (pseudo et numéro, calcul de la 1ère position, affichage, création de la boule)
	 */
	public void initPerso(String pseudo,Integer numPerso) {
	}

	/**
	 * getter sur MAXVIE
	 */
	public Integer getMAXVIE() {
		return MAXVIE;
	}
	
	/**
	 * getter sur GAIN
	 */
	public Integer getGAIN() {
		return GAIN;
	}
	
	/**
	 * getter sur PERTE
	 */
	public Integer getPERTE() {
		return PERTE;
	}
	
	/**
	 * getter sur pv
	 */
	public Integer getpv() {
		return pv;
	}
	
	/**
	 * getter sur pseudo
	 */
	public String getpseudo() {
		return pseudo;
	}
	
	/**
	 * getter sur numPerso
	 */
	public Integer getnumPerso() {
		return numPerso;
	}
	
	/**
	 * getter sur etape
	 */
	public Integer getetape() {
		return etape;
	}
	
	/**
	 * setter sur pv
	 */
	public void setpv(Integer pv) {
		this.pv=pv;
	}
	
	/**
	 * setter sur psuedo
	 */
	public void setpseudo(String pseudo) {
		this.pseudo=pseudo;
	}
	
	/**
	 * setter sur  numPerso
	 */
	public void setnumPerso(Integer numPerso) {
		this.numPerso=numPerso;
	}
	
	/**
	 * Calcul de la première position aléatoire du joueur (sans chevaucher un autre joueur ou un mur)
	 */
	private void premierePosition() {
	}
	
	/**
	 * Affiche le personnage et son message
	 */
	public void affiche() {
	}

	/**
	 * Gère une action reçue et qu'il faut afficher (déplacement, tire de boule...)
	 */
	public void action() {
	}

	/**
	 * Gère le déplacement du personnage
	 */
	private void deplace() { 
	}
	
	/**
	 * Gère le tir du personnage
	 */
	private void tire() {
	}

	/**
	 * Contrôle si le joueur touche un des autres joueurs
	 * @return true si deux joueurs se touchent
	 */
	private Boolean toucheJoueur() {
		return null;
	}

	/**
	 * Gain de points de vie après avoir touché un joueur
	 */
	public void gainVie() {
	}
	
	/**
	 * Perte de points de vie après avoir été touché 
	 */
	public void perteVie() {
	}
	
	/**
	 * vrai si la vie est à 0
	 * @return true si vie = 0
	 */
	public Boolean estMort() {
		return null;
	}
	
	/**
	 * Le joueur se déconnecte et disparait
	 */
	public void departJoueur() {
	}
	
}
